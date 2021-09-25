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
    // TODO logic for questions
    return repository.findById(id).orElse(null);
  }

  public Question save(Question question) {
    return repository.save(question);
  }
}
