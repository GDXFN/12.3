package com.example.demo.dataobject;

import lombok.Data;
import org.hibernate.annotations.Proxy;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Proxy(lazy = false)
@Data
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer userId;
    private String userName;
    private String userPassword;
    private String userEmail;
    private String userSex;
    private String userPhone;

    public User(String userName, String userPassword) {
        this.userName = userName;
        this.userPassword = userPassword;
    }
    public User(){}
}
