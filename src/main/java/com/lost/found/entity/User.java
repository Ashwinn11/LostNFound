package com.lost.found.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;

import java.util.List;

@Entity
@Data
@AllArgsConstructor
@RequiredArgsConstructor
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Email
    @NotEmpty(message = "Email Should not be empty")
    private String emailId;

    private String firstName;

    private String lastName;

    @JsonIgnore
    @OneToMany
    private List<Lost> lostItems;

    @JsonIgnore
    @OneToMany
    private List<Found> foundItems;
}
