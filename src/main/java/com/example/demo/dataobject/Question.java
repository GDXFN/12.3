package com.example.demo.dataobject;

import lombok.Data;
import org.hibernate.annotations.Proxy;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Proxy(lazy = false)
@Data
public class Question {
    @Id
    private Integer qId;
    private String qQuestions;
    private String qType;
    private String qOptionA;
    private String qOptionB;
    private String qOptionC;
    private String qOptionD;
    private String qOptionE;
    private String qOptionF;
    private String qAnswer;
}
