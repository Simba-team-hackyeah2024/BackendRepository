package simba.reflect.answer;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import simba.reflect.answer.dto.AnswerDto;

import java.util.List;

public interface AnswerRepository extends JpaRepository<AnswerEntity, Integer> {
    @Query("SELECT new simba.reflect.answer.dto.AnswerDto(a.answerID, a.answer, a.date) " +
            "FROM AnswerEntity a JOIN LinkAnswerEntity la ON a.answerID = la.answer.answerID " +
            "WHERE la.question.questionID = :questionId AND la.user.userId = :userId")
    List<AnswerDto> findAllByQuestionAndUser(Integer questionId, Integer userId);
}
