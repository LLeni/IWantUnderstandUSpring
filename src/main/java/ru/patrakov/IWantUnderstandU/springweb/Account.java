package ru.patrakov.IWantUnderstandU.springweb;

import javax.persistence.*;

@Entity
@Table(name = "account")
public class Account {

    public Account(int user_id, String username, String password, String email, String created_on, boolean is_admin){
        this.user_id = user_id;
        this.username = username;
        this.password = password;
        this.email = email;
        this.created_on = created_on;
        this.is_admin = is_admin;
    }

    @Id
    //@OneToMany
    @JoinColumn(name = "user_id")
    private int user_id;

    @Column(name = "username")
    private String username;

    @Column(name = "password")
    private String password;

    @Column(name = "email")
    private String email;

    @Column(name = "created_on")
    private String created_on;

    @Column(name = "is_admin")
    private boolean is_admin;

    public int getUser_id() {
        return user_id;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public String getEmail() {
        return email;
    }

    public String getCreated_on() {
        return created_on;
    }

    public boolean isIs_admin() {
        return is_admin;
    }
}
