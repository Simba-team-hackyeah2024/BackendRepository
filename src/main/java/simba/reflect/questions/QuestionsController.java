package simba.reflect.questions;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import simba.reflect.questions.dto.QuestionDto;

import java.util.List;

@RestController
@RequestMapping(("/questions"))
@AllArgsConstructor
public class QuestionsController {
	private QuestionsService questionsService;

	@GetMapping("/all")
	public List<QuestionDto> getAll() {
		return questionsService.getAllQuestions();
	}

	@GetMapping("/fromSet")
	public List<QuestionDto> getQuestionsFromSet(
			@RequestParam Integer userId,
			@RequestParam Integer setId) {
		return questionsService.getQuestionsFromSet(userId, setId);
	}

}
