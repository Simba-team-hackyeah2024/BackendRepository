package simba.reflect.users;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "Users")
@Getter
@Setter
public class UsersEntity {
	@Id
	@Column(name = "UserID")
	private long userId;

	@Column(name = "Username")
	private String username;

	@Column(name = "Email")
	private String email;

	@Column(name = "SHA256Password")
	private String passwordHash;

	@Column(name = "PhoneNumber", nullable = true)
	private Long phoneNumber;
}
