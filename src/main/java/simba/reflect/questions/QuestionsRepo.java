package simba.reflect.questions;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import simba.reflect.questions.dto.QuestionDto;
import java.util.List;

public interface QuestionsRepo extends JpaRepository<QuestionsEntity, Integer> {
	@Query("SELECT new simba.reflect.questions.dto.QuestionDto(q.questionID, q.question) " +
			"FROM QuestionEntity q JOIN LinkQuestionEntity lq ON q.questionID = lq.question.questionID " +
			"WHERE lq.user.userId = :userId AND lq.set.setId = :setId")
	List<QuestionDto> getQuestionsFromSet(Integer userId, Integer setId);
}
