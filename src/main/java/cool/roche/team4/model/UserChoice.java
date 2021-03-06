package cool.roche.team4.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import static javax.persistence.GenerationType.IDENTITY;

@Entity
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class UserChoice {

  @Id
  @GeneratedValue(strategy = IDENTITY)
  private Integer id;

  @Column(nullable = false)
  private Integer userId;

  @Column(nullable = false)
  private Integer questionId;

  @Column(nullable = false)
  private int answer;

  @Column(nullable = false)
  private String sessionId;

}
