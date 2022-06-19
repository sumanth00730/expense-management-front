package com.example.demo.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;
import javax.persistence.*;
import java.util.List;

@Entity

@Table(name="sumanthusers")
public class User {

    @Id
    @GeneratedValue(strategy =  GenerationType.IDENTITY)
    private Integer uid;
    @Column(length=30,nullable = false)
    private String fname;
    @Column(length = 30,nullable = false)
    private String lname;

    @Column(length = 30,nullable = false)
    private String email;
    @Column(length = 30,nullable = false)
    private String password;

//    @OneToMany(targetEntity = Category.class,cascade = CascadeType.ALL)
//    @JoinColumn(name="uc_fk",referencedColumnName = "uid")
//    private List<Category> categories;

    public User() {
    }

    public User(String fname, String lname, String email, String password) {
        this.fname = fname;
        this.lname = lname;
        this.email = email;
        this.password = password;
    }

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

}

