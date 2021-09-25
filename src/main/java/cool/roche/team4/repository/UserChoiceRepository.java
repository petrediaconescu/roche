package cool.roche.team4.repository;

import cool.roche.team4.model.UserChoice;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserChoiceRepository extends CrudRepository<UserChoice, Integer> {

}
