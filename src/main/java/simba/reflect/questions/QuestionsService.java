package simba.reflect.questions;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import java.util.List;
import simba.reflect.questions.dto.QuestionDto;

@Service
@AllArgsConstructor
public class QuestionsService {
	private QuestionsRepo questionsRepo;

	public String getAllSets() {
		return questionsRepo.findAll().toString();
	}

	public List<QuestionDto> getQuestionsFromSet(Integer userId, Integer setId) {
		return questionsRepo.getQuestionsFromSet(userId, setId);
	}

}
