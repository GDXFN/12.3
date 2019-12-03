package com.example.demo.dataobject;

import lombok.Data;
import org.hibernate.annotations.Proxy;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Proxy(lazy = false)
@Data
public class AdminInfo {
    @Id
    private int id;

    private String username;

    private String password;

    private int age;
}
