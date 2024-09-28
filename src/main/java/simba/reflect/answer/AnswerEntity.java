package simba.reflect.answer;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.Set;

@Entity
@Table(name = "Answers")
@Getter
@Setter
public class AnswerEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer answerID;

    @Column(nullable = false)
    private Integer answer;

    @Column(nullable = false)
    private LocalDateTime date;

    @OneToMany(mappedBy = "answer")
    private Set<LinkAnswerEntity> linkAnswers;

}

