package com.example.demo.service.impl;

import com.example.demo.dataobject.Introduction;
import com.example.demo.repository.IntroductionRepository;
import com.example.demo.service.IntroductionService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
public class IntroductionServiceImpl implements IntroductionService {
    @Autowired
    IntroductionRepository repository;

    @Override
    public List<Introduction> findAll() {
        return repository.findAll();
    }

    @Override
    public Introduction save(Introduction introduction) {
        return repository.save(introduction);
    }
}
