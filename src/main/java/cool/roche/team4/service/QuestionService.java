package cool.roche.team4.service;

import cool.roche.team4.model.Question;
import cool.roche.team4.repository.QuestionRepository;
import org.springframework.stereotype.Service;

@Service
public class QuestionService {

  private QuestionRepository repository;

  public QuestionService(QuestionRepository repository) {
    this.repository = repository;
  }

  public Question getQuestion(int id) {
    return repository.findById(id).orElse(null);
  }

  public Question answer(Question question) {
    return repository.save(question);
  }
}
