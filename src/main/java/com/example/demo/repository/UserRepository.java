package com.example.demo.repository;

import com.example.demo.dataobject.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Integer>
{
    User findByUserNameAndUserPassword(String userName,String userPassword);
}
