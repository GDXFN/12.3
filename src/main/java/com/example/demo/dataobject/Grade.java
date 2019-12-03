package com.example.demo.dataobject;

import lombok.Data;
import org.hibernate.annotations.Proxy;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Proxy(lazy = false)
@Data
public class Grade {
    @Id
    private String gId;
    private Integer userId;
    private String gName;
    private Integer gType;
    private Integer gGrade;
}
