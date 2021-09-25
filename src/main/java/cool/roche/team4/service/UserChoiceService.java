package cool.roche.team4.service;

import cool.roche.team4.model.UserChoice;
import cool.roche.team4.repository.UserChoiceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserChoiceService {

  private UserChoiceRepository repository;

  @Autowired
  public UserChoiceService(UserChoiceRepository repository) {
    this.repository = repository;
  }

  public UserChoice answer(UserChoice userChoice) {
    return repository.save(userChoice);
  }


}
