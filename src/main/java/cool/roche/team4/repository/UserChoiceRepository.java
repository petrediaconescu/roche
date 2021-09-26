package cool.roche.team4.repository;

import cool.roche.team4.model.UserChoice;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface UserChoiceRepository extends CrudRepository<UserChoice, Integer> {

  @Query(value = "SELECT * FROM USER_CHOICE WHERE USER_CHOICE_ID = ?1 AND session_id=?2", nativeQuery = true)
  Optional<UserChoice> findByIdAndSessionId(Integer userChoiceId, String sessionId);

}
