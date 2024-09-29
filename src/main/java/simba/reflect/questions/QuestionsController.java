package simba.reflect.questions;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
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

	@GetMapping("/fromSet/{userId}/{setId}")
	public List<QuestionDto> getQuestionsFromSet(
			@PathVariable Integer setId,
			@PathVariable Integer userId) {
		return questionsService.getQuestionsFromSet(setId, userId);
	}

}
