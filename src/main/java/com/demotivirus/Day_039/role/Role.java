package com.demotivirus.Day_039.role;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Data @AllArgsConstructor
@RequiredArgsConstructor
@Entity
@Table(name = "roles")
public class Role {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    @NonNull
    @Column(name = "role_code")
    String roleCode;

    @Column(name = "name")
    String name;

    @Column(name = "descr")
    String descr;
}
