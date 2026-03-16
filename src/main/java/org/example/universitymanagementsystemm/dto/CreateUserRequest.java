package org.example.universitymanagementsystemm.dto;

import lombok.Getter;
import lombok.Setter;
import org.example.universitymanagementsystemm.util.RoleType;

@Getter
@Setter
public class CreateUserRequest {

    private String username;
    private String email;
    private String firstName;
    private String lastName;
    private RoleType role;

}
