package com.example.demo.controller;

import com.example.demo.dataobject.Examexplain;
import com.example.demo.service.ExamexplainService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.validation.Valid;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/explain")
@CrossOrigin
public class ExamexplainController {
    @Autowired
    private ExamexplainService explainService;

    @ApiOperation(value = "使用说明",notes = "使用说明")
    @GetMapping("/excontent")
    public List<Examexplain> excontent(){
          List<Examexplain> explainList=explainService.findAll();

          return explainList;
    }

    @GetMapping("/excontentad")
    public ModelAndView excontentad(){
       return null;
    }

    @ApiOperation(value = "使用说明",notes = "修改使用说明")
    @PostMapping("/save")
    public ModelAndView save(@Valid Examexplain examexplain,
                             Map<String,Object> map){
        return null;
    }

}
