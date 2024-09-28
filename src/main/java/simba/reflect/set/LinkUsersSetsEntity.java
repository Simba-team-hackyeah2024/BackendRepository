package simba.reflect.set;

import jakarta.persistence.*;

import java.io.Serializable;
import java.time.LocalDateTime;
import lombok.Getter;
import lombok.Setter;
import simba.reflect.users.UsersEntity;

@Entity
@Table(name = "Link_Users_Sets")
@Getter
@Setter
@IdClass(LinkUsersSetsId.class)
public class LinkUsersSetsEntity {
    @Id
    @Column(name = "UserID")
    private Integer userId;

    @Id
    @Column(name = "SetID")
    private Integer setId;

    @ManyToOne
    @JoinColumn(name = "UserID", insertable = false, updatable = false)
    private UsersEntity user;

    @ManyToOne
    @JoinColumn(name = "SetID", insertable = false, updatable = false)
    private SetEntity set;

    @Column(name = "Priority", nullable = true)
    private Integer priority;

    @Column(name = "Last_Access", nullable = true)
    private LocalDateTime lastAccess;
}

class LinkUsersSetsId implements Serializable {
    private Integer userId;
    private Integer setId;
}
