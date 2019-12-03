package com.example.demo.controller;

import com.example.demo.dataobject.Question;
import com.example.demo.service.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/question")
@CrossOrigin
public class QuestionController {
    @Autowired
    private QuestionService questionService;

    @GetMapping("/qucontent")
    public ModelAndView qucontent(Map<String,Object> map)
    {
        List<Question> questionList=questionService.findAll();

        map.put("questionList",questionList);
        return new ModelAndView("a",map);
    }
}
