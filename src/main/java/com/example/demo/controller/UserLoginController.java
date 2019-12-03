package com.example.demo.controller;

import com.example.demo.dataobject.User;
import com.example.demo.service.UserService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;
import java.util.Map;

@RestController

@CrossOrigin
public class UserLoginController {
    @Autowired
    private UserService userService;

//    @GetMapping("/login")
//    @ApiOperation(value = "登录操作",notes = "根据账号密码登录")
//    public Boolean login(@RequestParam(value = "username",required = false) String username,
//                      @RequestParam(value = "password",required = false) String password,
//                      HttpServletResponse response,
//                      HttpServletRequest request)
//    {
//
//        User user;
//        user = userService.findByUserNameAndUserPassword(username,password);
//        if (user ==null)
//        {
//            return false;
//
//        }else {
//
//            request.getSession().setAttribute("username",username);
//            return true;
//        }
//    }
}
