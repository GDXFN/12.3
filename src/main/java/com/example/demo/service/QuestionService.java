package com.example.demo.service;

import com.example.demo.dataobject.Question;

import java.util.List;

public interface QuestionService {
    Question findOne(Integer qId);
    List<Question> findAll();
    Question save(Question question);

}
