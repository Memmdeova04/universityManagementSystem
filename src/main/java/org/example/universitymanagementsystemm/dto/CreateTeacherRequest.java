package org.example.universitymanagementsystemm.dto;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class CreateTeacherRequest {

    private Long userId;

    private List<Long> subjectIds;

}
