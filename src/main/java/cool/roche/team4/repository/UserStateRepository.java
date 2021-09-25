package cool.roche.team4.repository;

import cool.roche.team4.model.Question;
import org.springframework.data.repository.CrudRepository;

public interface UserStateRepository extends CrudRepository<Question, Integer> {

}
