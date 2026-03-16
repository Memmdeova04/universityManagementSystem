package org.example.universitymanagementsystemm.repository;

import org.example.universitymanagementsystemm.entity.Grade;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface GradeRepository extends JpaRepository<Grade,Long> {
    List<Grade> findAllByStudentId(Long studentId);

    Optional<Grade> findByStudentIdAndSubjectId(Long studentId, Long subjectId);
}
