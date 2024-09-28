package simba.reflect.answer;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import simba.reflect.questions.QuestionsEntity;
import simba.reflect.set.SetEntity;
import simba.reflect.users.UsersEntity;

@Entity
@Table(name = "Link_Answers")
@Getter
@Setter
public class LinkAnswerEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ALinkID")
    private Integer aLinkID;

    @ManyToOne
    @JoinColumn(name = "answerID", nullable = false)
    private AnswerEntity answer;

    @ManyToOne
    @JoinColumn(name = "questionID", nullable = false)
    private QuestionsEntity question;

    @ManyToOne
    @JoinColumn(name = "userID", nullable = false)
    private UsersEntity user;

    @ManyToOne
    @JoinColumn(name = "setID", nullable = false)
    private SetEntity set;
}
