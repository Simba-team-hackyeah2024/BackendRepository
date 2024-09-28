package simba.reflect.questions;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class QuestionsService {
	private QuestionsRepo questionsRepo;

	public String getAllSets() {
		return questionsRepo.findAll().toString();
	}
}
