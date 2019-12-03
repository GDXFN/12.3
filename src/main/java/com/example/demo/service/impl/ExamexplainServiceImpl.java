package com.example.demo.service.impl;


import com.example.demo.dataobject.Examexplain;
import com.example.demo.repository.ExamexplainRepository;
import com.example.demo.service.ExamexplainService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
public class ExamexplainServiceImpl implements ExamexplainService {
    @Autowired
    private ExamexplainRepository repository;

    @Override
    public Examexplain findOne(String exId) {

        return repository.getOne(exId);
    }

    @Override
    public List<Examexplain> findAll() {
        return repository.findAll();
    }

    @Override
    public Examexplain save(Examexplain explain) {
        return repository.save(explain);
    }
}
