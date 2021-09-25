package cool.roche.team4.repository;

import cool.roche.team4.model.UserChoice;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserChoiceRepository extends CrudRepository<UserChoice, Integer> {

  @Query(value = "SELECT question_id FROM USER_CHOICE WHERE USER_ID = ?1 AND answer = 1 AND session_id=?2", nativeQuery = true)
  List<Integer> findAllByUserIdAndSessionIdAndAnswer(Integer userId, String sessionId);
}
