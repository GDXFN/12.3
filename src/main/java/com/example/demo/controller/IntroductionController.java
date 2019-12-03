package com.example.demo.controller;

import com.example.demo.dataobject.Introduction;
import com.example.demo.service.IntroductionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/introduction")
@CrossOrigin
public class IntroductionController {
    @Autowired
    private IntroductionService introdutionService;

    @GetMapping("/incontent")
    public List<Introduction> incontent()
    {
        List<Introduction> introductionList=introdutionService.findAll();
        return introductionList;
    }
}
