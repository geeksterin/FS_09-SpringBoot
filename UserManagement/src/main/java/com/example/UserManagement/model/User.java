package com.example.UserManagement.model;

import jakarta.validation.constraints.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import org.hibernate.validator.constraints.Email;

@Data
@AllArgsConstructor
public class User {

    @NotBlank
    private String userId;
    @NotEmpty(message = "why is name empty!!!")
    private String name;
    @Email
    @NotEmpty
    private String userName;
    private String Address;
    @Size(min = 10,max = 12)
    @Pattern(regexp = "^[0-9]+$")
    private String phoneNumber;

    //HW : can we put validations on the request object itself
}




