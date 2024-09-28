package simba.reflect.set;

import jakarta.persistence.*;
import java.time.LocalDateTime;
import lombok.Getter;
import lombok.Setter;
import simba.reflect.users.UsersEntity;

@Entity
@Table(name = "LinkUsersSets")
@Getter
@Setter
public class LinkUsersSetsEntity {
    @Id
    @Column(name = "UserID")
    private Long userId;

    @Id
    @Column(name = "SetID")
    private Long setId;

    @ManyToOne
    @JoinColumn(name = "UserID", referencedColumnName = "UserID", insertable = false, updatable = false)
    private UsersEntity user;

    @ManyToOne
    @JoinColumn(name = "SetID", referencedColumnName = "SetID", insertable = false, updatable = false)
    private SetEntity set;

    @Column(name = "Priority", nullable = true)
    private Integer priority;

    @Column(name = "LastAccess", nullable = true)
    private LocalDateTime lastAccess;
}
