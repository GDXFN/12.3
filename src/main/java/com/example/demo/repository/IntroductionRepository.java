package com.example.demo.repository;

import com.example.demo.dataobject.Introduction;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IntroductionRepository extends JpaRepository<Introduction,String> {
}
