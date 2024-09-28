package simba.reflect.set;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface LinkUsersSetsRepository extends JpaRepository<LinkUsersSetsEntity, LinkUsersSetsId> {
  @Query("SELECT l.set FROM LinkUsersSetsEntity l WHERE l.userId = :userId")
  List<SetEntity> findAllSetsByUserId(Integer userId);
}