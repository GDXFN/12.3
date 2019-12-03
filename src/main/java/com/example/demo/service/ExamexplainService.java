package com.example.demo.service;

import com.example.demo.dataobject.Examexplain;

import java.util.List;

public interface ExamexplainService {
    Examexplain findOne(String exId);
    List<Examexplain> findAll();
    Examexplain save(Examexplain explain);

}
