package com.example.demo.repository;

import com.example.demo.dataobject.AdminInfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AdminRepository extends JpaRepository<AdminInfo,String> {

  public   AdminInfo findByAdminUsernameAndPassword(String username,String password);
}
