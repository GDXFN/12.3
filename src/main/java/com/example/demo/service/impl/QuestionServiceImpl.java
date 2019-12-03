package com.example.demo.service.impl;

import com.example.demo.dataobject.Question;
import com.example.demo.repository.QuestionRepository;
import com.example.demo.service.QuestionService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@Slf4j
public class QuestionServiceImpl implements QuestionService {
    @Autowired
    QuestionRepository repository;

    @Override
    public Question findOne(Integer qId) {
        return repository.getOne(qId);
    }

    @Override
    public List<Question> findAll() {
        List<Question> questionList=repository.findAll();
        return questionList;
    }

    @Override
    public Question save(Question question) {
        return null;
    }
}
