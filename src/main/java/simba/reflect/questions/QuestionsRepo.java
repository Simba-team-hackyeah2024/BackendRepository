package simba.reflect.questions;

import org.springframework.data.jpa.repository.JpaRepository;

public interface QuestionsRepo extends JpaRepository<QuestionsEntity, Integer> {
}
