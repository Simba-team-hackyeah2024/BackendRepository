package simba.reflect.answer;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import simba.reflect.answer.dto.AnswerDto;

import java.util.List;

@RestController
@RequestMapping("/answers")
@AllArgsConstructor
public class AnswerController {
    private AnswerService answerService;

    @GetMapping("/allByQuestionByUser/{userId}/{questionId}")
    public List<AnswerDto> allByQuestionByUser(@PathVariable Integer questionId, @PathVariable Integer userId) {
        return answerService.getAllByQuestionAndUser(questionId, userId);
    }

    @GetMapping("/allBySetByUser/{userId}/{setId}")
    public List<AnswerDto> allBySetByUser(@PathVariable Integer setId, @PathVariable Integer userId) {
        return answerService.getAllBySetAndUser(setId, userId);
    }
}
