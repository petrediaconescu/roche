package cool.roche.team4.controller;

import cool.roche.team4.model.Question;
import cool.roche.team4.service.QuestionService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("question")
public class QuestionController {

  private QuestionService service;

  public QuestionController(QuestionService service) {
    this.service = service;
  }

  @GetMapping("/{id}")
  public Question getQuestion(@PathVariable int id) {
    return service.getQuestion(id);
  }

  @PostMapping("/answer-question")
  Question answer(@RequestBody Question question) {
    return service.answer(question);
  }
}
