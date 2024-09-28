package simba.reflect.answer.dto;

import java.time.LocalDateTime;

public record AnswerDto(
        Integer answerId,
        Integer answer,
        LocalDateTime date
)
{ }
