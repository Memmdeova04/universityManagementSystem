package org.example.universitymanagementsystemm.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class StudentResponse {
    private Long id;

    private String firstName;
    private String lastName;

    private String groupName;

    private Double gpa;
}
