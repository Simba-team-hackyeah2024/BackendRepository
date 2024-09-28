package simba.reflect.questions;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "Questions")
@Getter
@Setter
public class QuestionsEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "QuestionID")
	private Long questionID;

	@Column(name = "Question")
	private String question;
}
