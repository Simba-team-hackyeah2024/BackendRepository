package simba.reflect.questions;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(("/questions"))
@AllArgsConstructor
public class QuestionsController {
	private QuestionsService questionsService;

	@GetMapping("/all")
	public String getAll() {
		return questionsService.getAllSets();
	}

}
