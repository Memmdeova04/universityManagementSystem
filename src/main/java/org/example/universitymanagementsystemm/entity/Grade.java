package org.example.universitymanagementsystemm.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.example.universitymanagementsystemm.util.GradeStatus;

@Entity
@Table(name = "grades")
@Getter
@Setter
public class Grade extends BaseEntity {

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "student_id")
    private Student student;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "subject_id")
    private Subject subject;

    private Double activity;
    private Double independentWork;
    private Double presentation;
    private Double colloquium;
    private Double examScore;

    public Double getEntryScore() {
        return (activity != null ? activity : 0) +
                (independentWork != null ? independentWork : 0) +
                (presentation != null ? presentation : 0) +
                (colloquium != null ? colloquium : 0);
    }

    public Double getFinalScore() {
        return getEntryScore() + (examScore != null ? examScore : 0);
    }

    public GradeStatus getStatus() {

        if (getEntryScore() < 17) {
            return GradeStatus.NOT_ALLOWED_TO_EXAM;
        }

        if (examScore != null && examScore < 17) {
            return GradeStatus.FAILED_EXAM;
        }

        if (getFinalScore() < 51) {
            return GradeStatus.FAILED_TOTAL;
        }

        return GradeStatus.PASSED;
    }
}