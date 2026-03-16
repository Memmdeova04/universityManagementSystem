package org.example.universitymanagementsystemm.dto;

import lombok.Getter;
import lombok.Setter;

import java.util.List;
@Setter
@Getter
public class TeacherResponse {
    private Long id;

    private String firstName;
    private String lastName;

    private List<String> subjects;
}
