package cool.roche.team4;

import cool.roche.team4.model.Question;
import cool.roche.team4.model.User;
import cool.roche.team4.service.QuestionService;
import cool.roche.team4.service.UserService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

@SpringBootApplication
public class Team4Application implements CommandLineRunner {

	private final QuestionService questionService;
	private final UserService userService;

	public Team4Application(QuestionService service, UserService userService) {
		this.questionService = service;
		this.userService = userService;
	}

	public static void main(String[] args) {
		SpringApplication.run(Team4Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		initializeUsersInDb();
		initializeQuestionsInDb();

	}

	private void initializeQuestionsInDb() throws IOException {
		Path path = Paths.get("src/main/resources/questions.csv");

		try (Stream<String> lines = Files.lines(path)) {
			lines.map(line -> line.split(","))
					.map(arr -> Question.builder().id(Integer.valueOf(arr[0])).text(arr[1]).build())
					.forEach(questionService::save);
		}
	}

	private void initializeUsersInDb() {
		for (int i = 0; i < 10; i++) {
			userService.save(User.builder().id(i).build());
		}
	}
}
