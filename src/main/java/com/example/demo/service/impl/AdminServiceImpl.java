package com.example.demo.service.impl;

import com.example.demo.dataobject.AdminInfo;
import com.example.demo.repository.AdminRepository;
import com.example.demo.service.AdminService;
import com.fasterxml.jackson.databind.annotation.JacksonStdImpl;
import org.springframework.beans.factory.annotation.Autowired;


public class AdminServiceImpl implements AdminService {
    @Autowired
    private AdminRepository repository;

    @Override
    public AdminInfo findByAdminUsernameAndPassword(String username, String password) {
        return repository.findByAdminUsernameAndPassword(username,password);
    }


}
