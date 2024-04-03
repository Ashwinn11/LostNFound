package com.lost.found.entity;

import jakarta.persistence.*;
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

    private String emailId;

    private String firstName;

    private String lastName;

    @OneToMany
    private List<Lost> lostItems;

    @OneToMany
    private List<Found> foundItems;
}
