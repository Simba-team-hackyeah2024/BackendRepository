package simba.reflect.questions;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import java.util.List;
import simba.reflect.questions.dto.QuestionDto;

@Service
@AllArgsConstructor
public class QuestionsService {
	private QuestionsRepo questionsRepo;

	public List<QuestionDto> getQuestionsFromSet(Integer userId, Integer setId) {
		return questionsRepo.getQuestionsFromSet(userId, setId);
	}

	public List<QuestionDto> getAllQuestions() {
		return questionsRepo.findAll()
				.stream()
				.map(q -> new QuestionDto(q.getQuestionID(), q.getQuestion()))
				.toList();
	}
}
