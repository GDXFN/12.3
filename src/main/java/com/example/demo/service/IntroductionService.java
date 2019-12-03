package com.example.demo.service;

import com.example.demo.dataobject.Introduction;

import java.util.List;

public interface IntroductionService {
    List<Introduction> findAll();
    Introduction save(Introduction introduction);
}
