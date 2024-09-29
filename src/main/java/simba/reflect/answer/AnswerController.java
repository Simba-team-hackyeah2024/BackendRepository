package simba.reflect.answer;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import simba.reflect.answer.dto.AnswerDto;

import java.util.List;

@RestController
@RequestMapping("/answers")
@AllArgsConstructor
public class AnswerController {
    private AnswerService answerService;

    @GetMapping("/allByQuestionByUser/{userId}/{questionId}")
    public List<AnswerDto> allByQuestionByUser(@RequestParam Integer questionId, @RequestParam Integer userId) {
        return answerService.getAllByQuestionAndUser(questionId, userId);
    }

    @GetMapping("/allBySetByUser/{userId}/{setId}")
    public List<AnswerDto> allBySetByUser(@RequestParam Integer setId, @RequestParam Integer userId) {
        return answerService.getAllBySetAndUser(setId, userId);
    }
}
