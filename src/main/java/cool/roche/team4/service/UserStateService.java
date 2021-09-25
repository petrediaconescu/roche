package cool.roche.team4.service;

import cool.roche.team4.model.UserState;
import cool.roche.team4.repository.UserStateRepository;
import org.springframework.stereotype.Service;

@Service
public class UserStateService {

  private UserStateRepository repository;

  public UserState getState(int userId) {
    return UserState.builder().userId(userId).build(); //TODO
  }
}
