package cool.roche.team4.controller;

import cool.roche.team4.model.UserChoice;
import cool.roche.team4.service.UserChoiceService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("send-answer")
public class UserChoiceController {

  private UserChoiceService service;

  public UserChoiceController(UserChoiceService service) {
    this.service = service;
  }

  @PostMapping("/")
  UserChoice sendAnswer(@RequestBody UserChoice userChoice) {
    return service.answer(userChoice);
  }
}
