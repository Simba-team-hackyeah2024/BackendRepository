package simba.reflect.note;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import simba.reflect.questions.QuestionsEntity;
import simba.reflect.set.SetEntity;
import simba.reflect.users.UsersEntity;

@Entity
@Table(name = "Link_Notes")
@Getter
@Setter
public class LinkNotesEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "NLinkID")
    private Integer nLinkID;

    @ManyToOne
    @JoinColumn(name = "UserID", nullable = false)
    private UsersEntity user;

    @ManyToOne
    @JoinColumn(name = "QuestionID")
    private QuestionsEntity question;

    @ManyToOne
    @JoinColumn(name = "SetID")
    private SetEntity set;

}
