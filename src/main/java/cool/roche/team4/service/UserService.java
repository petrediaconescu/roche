package cool.roche.team4.service;

import cool.roche.team4.model.User;
import cool.roche.team4.model.UserChoice;
import cool.roche.team4.repository.UserChoiceRepository;
import cool.roche.team4.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.Objects;

@Service
public class UserService {

  private UserRepository userRepository;

  private UserChoiceRepository userChoiceRepository;

  public UserService(UserRepository repository, UserChoiceRepository userChoiceRepository) {
    this.userRepository = repository;
    this.userChoiceRepository = userChoiceRepository;
  }

  public User save(User user) {
    return userRepository.save(user);
  }

  public UserChoice getLastUserChoice(Integer userId) {
    User user = userRepository.findById(userId).orElseThrow(IllegalArgumentException::new);
    if (isTheFirstTime(user)) {
      return UserChoice.builder().build();
    }
    return userChoiceRepository.findByIdAndSessionId(user.getLastUserChoiceId(), user.getSessionId()).orElseThrow(IllegalArgumentException::new);
  }

  private boolean isTheFirstTime(User user) {
    return Objects.isNull(user.getLastUserChoiceId());
  }
}
