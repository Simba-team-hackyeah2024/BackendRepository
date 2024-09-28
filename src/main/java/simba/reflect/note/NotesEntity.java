package simba.reflect.note;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Entity
@Table(name = "Notes")
@Getter
@Setter
public class NotesEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long noteID;

    @Column(columnDefinition = "TEXT")
    private String note;

    @Column
    private LocalDateTime creationTime;

    @Column(length = 10)
    private String nagging;

}
