package com.lost.found.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.hibernate.annotations.DialectOverride;

import java.sql.Timestamp;
import java.time.LocalDateTime;

@Entity
@Data
@AllArgsConstructor
@RequiredArgsConstructor
public class Lost {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    private String itemName;

    @Column(length = 500)
    private String description;

    @ManyToOne
    private User lostBy;

    private String lostAt;

    private Timestamp lostOn;

    @Column(length = 500)
    private String imageUrl;

    @Enumerated(value =EnumType.STRING)
    private Status status;
}
