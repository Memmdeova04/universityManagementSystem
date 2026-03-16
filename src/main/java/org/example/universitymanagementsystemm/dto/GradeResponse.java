package org.example.universitymanagementsystemm.dto;

import lombok.Data;
import org.example.universitymanagementsystemm.util.GradeStatus;
@Data
public class GradeResponse {


        private Long studentId;
        private String studentName;

        private String subjectName;

        private Double entryScore;
        private Double examScore;
        private Double finalScore;

        private GradeStatus status;

}
