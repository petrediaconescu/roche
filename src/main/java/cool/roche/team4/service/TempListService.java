package cool.roche.team4.service;

import cool.roche.team4.model.Question;
import cool.roche.team4.model.User;
import cool.roche.team4.repository.QuestionRepository;
import cool.roche.team4.repository.TempListRepository;
import cool.roche.team4.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

@Service
public class TempListService {

  private TempListRepository tempListRepository;
  private UserRepository userRepository;
  private QuestionRepository questionRepository;

  public TempListService(TempListRepository tempListRepository, UserRepository userRepository, QuestionRepository questionRepository) {
    this.tempListRepository = tempListRepository;
    this.userRepository = userRepository;
    this.questionRepository = questionRepository;
  }

  public boolean createTempList(Integer userId) {

    User user = userRepository.findById(userId).orElseThrow(IllegalArgumentException::new);

    user.setSessionId(computeSessionId(userId));
    user.setLastUserChoiceId(null);
    userRepository.save(user);

    List<Question> questions = StreamSupport.stream(questionRepository.findAll().spliterator(), false)
        .collect(Collectors.toList());

    tempListRepository.saveAll(questions);

    return true;
  }

  private String computeSessionId(Integer userId) {
    return String.valueOf(userId) + String.valueOf(System.currentTimeMillis());
  }

}
