package com.example.demo.service.impl;

import com.example.demo.dataobject.User;
import com.example.demo.repository.UserRepository;
import com.example.demo.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class UserServiceImpl implements UserService
{
    @Autowired
    private UserRepository repository;

    @Override
    public User findByUserNameAndUserPassword(String userName, String userPassword) {
        return repository.findByUserNameAndUserPassword(userName,userPassword);
    }
}
