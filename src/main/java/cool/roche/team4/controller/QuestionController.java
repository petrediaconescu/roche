package cool.roche.team4.controller;

import cool.roche.team4.model.Question;
import cool.roche.team4.service.QuestionService;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("question")
public class QuestionController {

  private QuestionService service;

  public QuestionController(QuestionService service) {
    this.service = service;
  }

  @GetMapping("by-patient-id/{patientId}")
  public Question getQuestion(@PathVariable int patientId) {
    return service.getQuestion(patientId)
        .orElse(Question.builder().text("Thank you for answering the questions").build());
  }

}
