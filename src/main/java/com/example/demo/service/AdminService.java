package com.example.demo.service;

import com.example.demo.dataobject.AdminInfo;
import org.springframework.stereotype.Service;


@Service
public interface AdminService {
    AdminInfo findByAdminUsernameAndPassword(String username,String password);
}
