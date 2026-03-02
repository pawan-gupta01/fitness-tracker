package com.project.fitness.dto;

import com.project.fitness.model.UserRole;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class  RegisterUser {
    @NotNull(message = "Email is required")
    @Email(message = "Invalid email")
    private String email;
    @NotNull(message = "Password is required")
    private String password;
    private String firstName;
    private String lastName;
    private UserRole role;
}