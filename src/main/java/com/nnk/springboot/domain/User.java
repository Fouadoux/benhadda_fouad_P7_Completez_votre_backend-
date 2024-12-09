package com.nnk.springboot.domain;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "users")
@Data
@NoArgsConstructor
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Correspond à AUTO_INCREMENT dans MySQL
    private int id;

    @NotBlank(message = "Username is mandatory")
    @Column(name = "username", length = 125)
    private String username;

    @NotBlank(message = "Password is mandatory")
    @Column(name = "password", length = 125)
    private String password;

    @NotBlank(message = "FullName is mandatory")
    @Column(name = "fullname", length = 125)
    private String fullName;

    @NotBlank(message = "Role is mandatory")
    @Column(name = "role", length = 125)
    private String role;
}