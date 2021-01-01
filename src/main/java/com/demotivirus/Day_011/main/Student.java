package com.demotivirus.Day_011.main;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "student")
@NoArgsConstructor
@RequiredArgsConstructor
@Data
public class Student {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @NonNull
    @Column(name = "first_name")
    private String first_name;

    @NonNull
    @Column(name = "last_name")
    private String last_name;

    @NonNull
    @Column(name = "email")
    private String email;
}
