package simba.reflect.note;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import simba.reflect.questions.QuestionsEntity;
import simba.reflect.set.SetEntity;
import simba.reflect.users.UsersEntity;

@Entity
@Table(name = "LinkNotes")
@Getter
@Setter
public class LinkNotesEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long nLinkID;

    @ManyToOne
    @JoinColumn(name = "userID", nullable = false)
    private UsersEntity user;

    @ManyToOne
    @JoinColumn(name = "questionID")
    private QuestionsEntity question;

    @ManyToOne
    @JoinColumn(name = "setID")
    private SetEntity set;

}
