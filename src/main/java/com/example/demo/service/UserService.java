package com.example.demo.service;

import com.example.demo.dataobject.User;

public interface UserService
{
    User findByUserNameAndUserPassword(String userName, String userPassword);
}
