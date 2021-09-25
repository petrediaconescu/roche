package cool.roche.team4.service;

import cool.roche.team4.model.User;
import cool.roche.team4.repository.UserRepository;
import org.springframework.stereotype.Service;

@Service
public class UserService {

  private UserRepository repository;

  public UserService(UserRepository repository) {
    this.repository = repository;
  }

  public User save(User user) {
    return repository.save(user);
  }
}
