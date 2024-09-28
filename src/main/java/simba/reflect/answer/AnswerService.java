package simba.reflect.answer;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import simba.reflect.answer.dto.AnswerDto;

import java.util.List;

@Service
@AllArgsConstructor
public class AnswerService {
    private AnswerRepository answerRepository;

    public List<AnswerDto> getAllByQuestionAndUser(Integer questionId, Integer userId) {
        return answerRepository.findAllByQuestionAndUser(questionId, userId);
    }

}
