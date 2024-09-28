package simba.reflect.questions;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import simba.reflect.set.SetEntity;
import simba.reflect.users.UsersEntity;

@Entity
@Table(name = "Link_Questions")
@Getter
@Setter
public class LinkQuestionEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "QLinkID")
    private Integer qLinkID;

    @ManyToOne
    @JoinColumn(name = "QuestionID", nullable = false)
    private QuestionsEntity question;

    @ManyToOne
    @JoinColumn(name = "SetID", nullable = false)
    private SetEntity set;

    @ManyToOne
    @JoinColumn(name = "UserID", nullable = true)
    private UsersEntity user;
}
