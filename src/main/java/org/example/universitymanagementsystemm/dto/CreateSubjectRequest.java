package org.example.universitymanagementsystemm.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CreateSubjectRequest {
    private String name;
    private String code;
    private Integer credits;
}
