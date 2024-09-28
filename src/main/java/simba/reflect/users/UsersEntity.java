package simba.reflect.users;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import simba.reflect.answer.LinkAnswerEntity;
import simba.reflect.note.LinkNotesEntity;
import simba.reflect.questions.LinkQuestionEntity;
import simba.reflect.set.LinkUsersSetsEntity;

import java.util.Set;

@Entity
@Table(name = "Users")
@Getter
@Setter
public class UsersEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "UserID")
	private Integer userId;

	@Column(name = "Username")
	private String username;

	@Column(name = "Email")
	private String email;

	@Column(name = "PasswordSHA256", nullable = false, length = 100)
	private String passwordSHA256;


	@Column(name = "PhoneNumber", nullable = true)
	private Long phoneNumber;

	@OneToMany(mappedBy = "user")
	private Set<LinkNotesEntity> linkNotes;

	@OneToMany(mappedBy = "user")
	private Set<LinkUsersSetsEntity> linkUserSets;

	@OneToMany(mappedBy = "user")
	private Set<LinkQuestionEntity> linkQuestions;

	@OneToMany(mappedBy = "user")
	private Set<LinkAnswerEntity> linkAnswers;
}
