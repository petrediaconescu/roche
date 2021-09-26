package cool.roche.team4.service;

import cool.roche.team4.model.Question;
import cool.roche.team4.model.UserChoice;
import cool.roche.team4.repository.QuestionRepository;
import org.springframework.stereotype.Service;

import java.util.Objects;
import java.util.Optional;

@Service
public class QuestionService {

  private QuestionRepository repo;

  private UserService userService;

  public QuestionService(QuestionRepository repository, UserService userService) {
    this.repo = repository;
    this.userService = userService;
  }

  public Question getQuestion(int patientId) {
    UserChoice lastUserChoice = userService.getLastUserChoice(patientId);
    return getNextQuestion(lastUserChoice).orElse(null);
  }

  public Question save(Question question) {
    return repo.save(question);
  }

  private Optional<Question> getNextQuestion(UserChoice lastUserChoice) {
    Integer questionId = lastUserChoice.getQuestionId();
    int answer = lastUserChoice.getAnswer();

    if (Objects.isNull(lastUserChoice.getQuestionId())) {
      return repo.findById(1);
    } else if (questionId == 1 && answer == 1) {
        return repo.findById(6);
    } else if (questionId == 6 ) {
      // 7
    } else if (questionId == 1 && answer == 0 ) {
      // 2
    } else if (questionId == 7) {
    // 8
    } else if (questionId == 8 ) {
    // 9
    } else if (questionId == 9) {
// 10
    } else if (questionId == 10) {
// 11
    } else if (questionId == 11 ) {
// 12
    } else if (questionId == 12) {
// 13
    } else if (questionId == 13 ) {
// 14
    } else if (questionId == 14) {
// 15
    } else if (questionId == 15 && answer == 1) {
// 59
    } else if (questionId == 15 && answer == 0) {
// 16
    } else if (questionId == 59) {
// 16
    } else if (questionId == 16 ) {
// 17
    } else if (questionId == 17 && answer == 1) {
// 37
    } else if (questionId == 37 && answer == 1) {
// 65
    } else if (questionId == 65 && answer == 1) {
// 76
    } else if (questionId == 76) {
// 77
    } else if (questionId == 77) {
// 78
    } else if (questionId == 65 && answer == 0) {
// 79
    } else if (questionId == 79) {
// 80
    } else if (questionId == 80) {
// 81
    } else if (questionId == 81) {
// 82
    } else if (questionId == 82 ) {
// 76
    } else if (questionId == 37 && answer == 0) {
// 68
    } else if (questionId == 68) {
// 67
    } else if (questionId == 67) {
//66
    } else if (questionId == 66 && answer == 1) {
// 83
    } else if (questionId == 83 ) {
// 84
    } else if (questionId == 84) {
// 85
    } else if (questionId == 85 ) {
// 65
    } else if (questionId == 17 && answer == 0) {
// 2
    } else if (questionId == 66 && answer == 0) {
// 2
    } else if (questionId == 78) {
// 2
    } else if (questionId == 2 && answer == 1) {
// 18
    } else if (questionId == 18 && answer == 1) {
// 38
    } else if (questionId == 38) {
// 39
    } else if (questionId == 39 ) {
// 40
    } else if (questionId == 18 && answer == 0) {
// 19
    } else if (questionId == 40) {
// 19
    } else if (questionId == 19 && answer == 1) {
// 41
    } else if (questionId == 41 ) {
// 42
    } else if (questionId == 42) {
// 43
    } else if (questionId == 43) {
// 20
    } else if (questionId == 19 && answer == 0) {
// 20
    } else if (questionId == 20 && answer == 1) {
// 44
    } else if (questionId == 44 ) {
// 45
    } else if (questionId == 45) {
// 46
    } else if (questionId == 46 ) {
// 21
    } else if (questionId == 20 && answer == 0) {
// 21
    } else if (questionId == 21 && answer == 1) {
// 47
    } else if (questionId == 47 ) {
// 48
    } else if (questionId == 48) {
// 49
    } else if (questionId == 49 ) {
// 22
    } else if (questionId == 21 && answer == 0) {
// 22
    } else if (questionId == 22 && answer == 1) {
// 50
    } else if (questionId == 50 ) {
// 51
    } else if (questionId == 51 ) {
// 52
    } else if (questionId == 52) {
// 23
    } else if (questionId == 22 && answer == 0) {
// 23
    } else if (questionId == 23) {
// 24
    } else if (questionId == 24) {
// 3
    } else if (questionId == 2 && answer == 0) {
// 18
    } else if (questionId == 88 && answer == 1) {
// 60
    } else if (questionId == 60 && answer == 1) {
// 69
    } else if (questionId == 69 ) {
// 70
    } else if (questionId == 70 ) {
// 71
    } else if (questionId == 71 ) {
// 61
    } else if (questionId == 60 && answer == 0) {
// 61
    } else if (questionId == 61 && answer == 1) {
// 72
    } else if (questionId == 72) {
// 73
    } else if (questionId == 73) {
// 74
    } else if (questionId == 74) {
// 3
    } else if (questionId == 61 && answer == 0) {
// 3
    } else if (questionId == 88 && answer == 0) {
// 3
    } else if (questionId == 2 && answer == 0) {
// 3
    } else if (questionId == 3 && answer == 1) {
// 25
    } else if (questionId == 25 ) {
//26
    } else if (questionId == 26 ) {
// 27
    } else if (questionId == 27) {
// 28
    } else if (questionId == 28 ) {
// 29
    } else if (questionId == 29 ) {
// 30
    } else if (questionId == 30 ) {
// 31
    } else if (questionId == 31 ) {
// 32
    } else if (questionId == 32 ) {
// 4
    } else if (questionId == 3 && answer == 0) {
// 4
    } else if (questionId == 4 && answer == 1) {
// 33
    } else if (questionId == 33 && answer == 1) {
// 87
    } else if (questionId == 87 ) {
// 34
    } else if (questionId == 33 && answer == 0) {
// 34
    } else if (questionId == 34 && answer == 1) {
// 62
    } else if (questionId == 62) {
// 35
    } else if (questionId == 34 && answer == 0) {
// 35
    } else if (questionId == 35 && answer == 0) {
// 5
    } else if (questionId == 4 && answer == 0) {
// 5
    } else if (questionId == 5 && answer == 1) {
// 36
    } else if (questionId == 36 && answer == 1) {
// 63
    } else if (questionId == 63 && answer == 0) {
// END
    } else if (questionId == 63 && answer == 1) {
// 75
    } else if (questionId == 75 && answer == 1) {
// 86
    } else if (questionId == 75 && answer == 0) {
// END
    } else if (questionId == 86) {
// END
    } else if (questionId == 36 && answer == 0) {
// 64
    } else if (questionId == 64) {
// END
    } else if (questionId == 5 && answer == 0) {
// END
    }

    return null;
  }
}
