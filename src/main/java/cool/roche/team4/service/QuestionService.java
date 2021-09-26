package cool.roche.team4.service;

import cool.roche.team4.model.Question;
import cool.roche.team4.model.UserChoice;
import cool.roche.team4.repository.QuestionRepository;
import org.springframework.stereotype.Service;

import java.util.Objects;
import java.util.Optional;

import static java.util.Optional.empty;

@Service
public class QuestionService {

  private QuestionRepository repo;

  private UserService userService;

  public QuestionService(QuestionRepository repository, UserService userService) {
    this.repo = repository;
    this.userService = userService;
  }

  public Optional<Question> getQuestion(int patientId) {
    UserChoice lastUserChoice = userService.getLastUserChoice(patientId);
    return getNextQuestion(lastUserChoice);
  }

  public Question save(Question question) {
    return repo.save(question);
  }

  private Optional<Question> getNextQuestion(UserChoice lastUserChoice) {
    Integer questionId = lastUserChoice.getQuestionId();
    int answer = lastUserChoice.getAnswer();

    // if you think it's hard to debug it, imagine how was to write it... :D
    if (Objects.isNull(lastUserChoice.getQuestionId())) {
      return repo.findById(1);
    } else if (questionId == 1 && answer == 1) {
      return repo.findById(6);
    } else if (questionId == 6) {
      // 7
      return repo.findById(7);
    } else if (questionId == 1 && answer == 0) {
      // 2
      return repo.findById(2);
    } else if (questionId == 7) {
      return repo.findById(8);
      // 8
    } else if (questionId == 8) {
      return repo.findById(9);
      // 9
    } else if (questionId == 9) {
// 10
      return repo.findById(10);
    } else if (questionId == 10) {
// 11
      return repo.findById(11);
    } else if (questionId == 11) {
// 12
      return repo.findById(12);
    } else if (questionId == 12) {
// 13
      return repo.findById(13);
    } else if (questionId == 13) {
// 14
      return repo.findById(14);
    } else if (questionId == 14) {
// 15
      return repo.findById(15);
    } else if (questionId == 15 && answer == 1) {
// 59
      return repo.findById(59);
    } else if (questionId == 15 && answer == 0) {
// 16
      return repo.findById(16);
    } else if (questionId == 59) {
// 16
      return repo.findById(16);
    } else if (questionId == 16) {
// 17
      return repo.findById(17);
    } else if (questionId == 17 && answer == 1) {
// 37
      return repo.findById(37);
    } else if (questionId == 37 && answer == 1) {
// 65
      return repo.findById(65);
    } else if (questionId == 65 && answer == 1) {
// 76
      return repo.findById(76);
    } else if (questionId == 76) {
// 77
      return repo.findById(77);
    } else if (questionId == 77) {
// 78
      return repo.findById(78);
    } else if (questionId == 65 && answer == 0) {
// 79
      return repo.findById(79);
    } else if (questionId == 79) {
// 80
      return repo.findById(80);
    } else if (questionId == 80) {
// 81
      return repo.findById(81);
    } else if (questionId == 81) {
// 82
      return repo.findById(82);
    } else if (questionId == 82) {
// 76
      return repo.findById(76);
    } else if (questionId == 37 && answer == 0) {
// 68
      return repo.findById(68);
    } else if (questionId == 68) {
// 67
      return repo.findById(67);
    } else if (questionId == 67) {
//66
      return repo.findById(66);
    } else if (questionId == 66 && answer == 1) {
// 83
      return repo.findById(83);
    } else if (questionId == 83) {
// 84
      return repo.findById(84);
    } else if (questionId == 84) {
// 85
      return repo.findById(85);
    } else if (questionId == 85) {
// 65
      return repo.findById(65);
    } else if (questionId == 17 && answer == 0) {
// 2
      return repo.findById(2);
    } else if (questionId == 66 && answer == 0) {
// 2
      return repo.findById(2);
    } else if (questionId == 78) {
// 2
      return repo.findById(2);
    } else if (questionId == 2 && answer == 1) {
// 18
      return repo.findById(18);
    } else if (questionId == 18 && answer == 1) {
// 38
      return repo.findById(38);
    } else if (questionId == 38) {
// 39
      return repo.findById(39);
    } else if (questionId == 39) {
// 40
      return repo.findById(40);
    } else if (questionId == 18 && answer == 0) {
// 19
      return repo.findById(19);
    } else if (questionId == 40) {
// 19
      return repo.findById(19);
    } else if (questionId == 19 && answer == 1) {
// 41
      return repo.findById(41);
    } else if (questionId == 41) {
// 42
      return repo.findById(42);
    } else if (questionId == 42) {
// 43
      return repo.findById(43);
    } else if (questionId == 43) {
// 20
      return repo.findById(20);
    } else if (questionId == 19 && answer == 0) {
// 20
      return repo.findById(20);
    } else if (questionId == 20 && answer == 1) {
// 44
      return repo.findById(44);
    } else if (questionId == 44) {
// 45
      return repo.findById(45);
    } else if (questionId == 45) {
// 46
      return repo.findById(46);
    } else if (questionId == 46) {
// 21
      return repo.findById(21);
    } else if (questionId == 20 && answer == 0) {
// 21
      return repo.findById(21);
    } else if (questionId == 21 && answer == 1) {
// 47
      return repo.findById(47);
    } else if (questionId == 47) {
// 48
      return repo.findById(48);
    } else if (questionId == 48) {
// 49
      return repo.findById(49);
    } else if (questionId == 49) {
// 22
      return repo.findById(22);
    } else if (questionId == 21 && answer == 0) {
// 22
      return repo.findById(22);
    } else if (questionId == 22 && answer == 1) {
// 50
      return repo.findById(50);
    } else if (questionId == 50) {
// 51
      return repo.findById(51);
    } else if (questionId == 51) {
// 52
      return repo.findById(52);
    } else if (questionId == 52) {
// 23
      return repo.findById(23);
    } else if (questionId == 22 && answer == 0) {
// 23
      return repo.findById(23);
    } else if (questionId == 23) {
// 24
      return repo.findById(24);
    } else if (questionId == 24) {
// 3
      return repo.findById(3);
    } else if (questionId == 88 && answer == 1) {
// 60
      return repo.findById(60);
    } else if (questionId == 60 && answer == 1) {
// 69
      return repo.findById(69);
    } else if (questionId == 69) {
// 70
      return repo.findById(70);
    } else if (questionId == 70) {
// 71
      return repo.findById(71);
    } else if (questionId == 71) {
// 61
      return repo.findById(61);
    } else if (questionId == 60 && answer == 0) {
// 61
      return repo.findById(61);
    } else if (questionId == 61 && answer == 1) {
// 72
      return repo.findById(72);
    } else if (questionId == 72) {
// 73
      return repo.findById(73);
    } else if (questionId == 73) {
// 74
      return repo.findById(74);
    } else if (questionId == 74) {
// 3
      return repo.findById(3);
    } else if (questionId == 61 && answer == 0) {
// 3
      return repo.findById(3);
    } else if (questionId == 88 && answer == 0) {
// 3
      return repo.findById(3);
    } else if (questionId == 2 && answer == 0) {
// 3
      return repo.findById(3);
    } else if (questionId == 3 && answer == 1) {
// 25
      return repo.findById(25);
    } else if (questionId == 25) {
//26
      return repo.findById(26);
    } else if (questionId == 26) {
// 27
      return repo.findById(27);
    } else if (questionId == 27) {
// 28
      return repo.findById(28);
    } else if (questionId == 28) {
// 29
      return repo.findById(29);
    } else if (questionId == 29) {
// 30
      return repo.findById(30);
    } else if (questionId == 30) {
// 31
      return repo.findById(31);
    } else if (questionId == 31) {
// 32
      return repo.findById(32);
    } else if (questionId == 32) {
// 4
      return repo.findById(4);
    } else if (questionId == 3 && answer == 0) {
// 4
      return repo.findById(4);
    } else if (questionId == 4 && answer == 1) {
// 33
      return repo.findById(33);
    } else if (questionId == 33 && answer == 1) {
// 87
      return repo.findById(87);
    } else if (questionId == 87) {
// 34
      return repo.findById(34);
    } else if (questionId == 33 && answer == 0) {
// 34
      return repo.findById(34);
    } else if (questionId == 34 && answer == 1) {
// 62
      return repo.findById(62);
    } else if (questionId == 62) {
// 35
      return repo.findById(35);
    } else if (questionId == 34 && answer == 0) {
// 35
      return repo.findById(35);
    } else if (questionId == 35 && answer == 0) {
// 5
      return repo.findById(5);
    } else if (questionId == 4 && answer == 0) {
// 5
      return repo.findById(5);
    } else if (questionId == 5 && answer == 1) {
// 36
      return repo.findById(36);
    } else if (questionId == 36 && answer == 1) {
// 63
      return repo.findById(63);
    } else if (questionId == 63 && answer == 0) {
// END
      return empty();
    } else if (questionId == 63 && answer == 1) {
// 75
      return repo.findById(75);
    } else if (questionId == 75 && answer == 1) {
// 86
      return repo.findById(86);
    } else if (questionId == 75 && answer == 0) {
// END
      return empty();
    } else if (questionId == 86) {
// END
      return empty();
    } else if (questionId == 36 && answer == 0) {
// 64
      return repo.findById(64);
    } else if (questionId == 64) {
// END
      return empty();
    } else if (questionId == 5 && answer == 0) {
      return empty();
    }

    return empty();
  }
}
