package cool.roche.team4.service;

import cool.roche.team4.model.User;
import cool.roche.team4.model.UserChoice;
import cool.roche.team4.repository.UserChoiceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserChoiceService {

  private UserChoiceRepository repository;

  private UserService userService;

  @Autowired
  public UserChoiceService(UserChoiceRepository repository, UserService userService) {
    this.repository = repository;
    this.userService = userService;
  }

  public UserChoice answer(UserChoice userChoice) {
    User user = userService.findById(userChoice.getUserId());
    userChoice.setSessionId(user.getSessionId());
    UserChoice savedUserChoice = repository.save(userChoice);
    user.setLastUserChoiceId(savedUserChoice.getId());
    userService.save(user);
    return savedUserChoice;
  }

}
