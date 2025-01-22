package org.airtribe.LearnerManagementSystem.repository;

import org.airtribe.LearnerManagementSystem.entity.Learner;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;


@Repository
public interface LearnerRepository extends JpaRepository<Learner, Long> {

  @Query("SELECT l FROM Learner l WHERE l.name = :learnerName")
  Learner findByLearnerName(String learnerName);
}
