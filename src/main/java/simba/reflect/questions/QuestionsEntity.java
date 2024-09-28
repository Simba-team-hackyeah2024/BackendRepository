package simba.reflect.questions;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import simba.reflect.answer.LinkAnswerEntity;
import simba.reflect.note.LinkNotesEntity;

import java.util.Set;

@Entity
@Table(name = "Questions")
@Getter
@Setter
public class QuestionsEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "QuestionID")
	private Integer questionID;

	@Column(name = "Question", columnDefinition = "TEXT")
	private String question;

	@OneToMany(mappedBy = "question")
	private Set<LinkNotesEntity> linkNotes;

	@OneToMany(mappedBy = "question")
	private Set<LinkQuestionEntity> linkQuestions;

	@OneToMany(mappedBy = "question")
	private Set<LinkAnswerEntity> linkAnswers;
}
