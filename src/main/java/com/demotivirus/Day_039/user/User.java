package com.demotivirus.Day_039.user;

import com.demotivirus.Day_039.role.Role;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import java.util.ArrayList;
import java.util.List;

@Data @NoArgsConstructor
@RequiredArgsConstructor
@Entity
@Table(name = "users")
public class User {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    long id;

    @NonNull
    @Column(name = "email")
    String email;

    @Column(name = "login")
    String login;

    @Column(name = "password")
    String password;

    @ManyToMany(cascade= CascadeType.ALL, fetch= FetchType.LAZY)
    @JoinTable(name="user_roles",
            joinColumns = @JoinColumn(name = "user_id"),
            inverseJoinColumns = @JoinColumn(name = "role_id"))
    List<Role> roles;

    public void addRole(Role role){
        checkInitRoles();
        roles.add(role);
    }

    private void checkInitRoles(){
        if (roles == null)
            roles = new ArrayList<>();
    }
}
