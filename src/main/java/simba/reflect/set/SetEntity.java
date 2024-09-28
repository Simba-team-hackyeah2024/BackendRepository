package simba.reflect.set;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import simba.reflect.questions.LinkQuestionEntity;

import java.time.LocalDateTime;
import java.util.Set;

@Entity
@Table(name = "Sets")
@Getter
@Setter
public class SetEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "SetID")
    private Integer setID;

    @Column(length = 50, name = "Name")
    private String name;

    @Column(length = 255, name = "Description")
    private String description;

    @Column(name = "NextNotification")
    private LocalDateTime nextNotification;

    @Column(name = "NotificationRepeatTimeHours")
    private Integer notificationRepeatTimeHours;

    @OneToMany(mappedBy = "set")
    private Set<LinkUsersSetsEntity> linkUsersSets;

    @OneToMany(mappedBy = "set")
    private Set<LinkQuestionEntity> linkQuestions;
}
