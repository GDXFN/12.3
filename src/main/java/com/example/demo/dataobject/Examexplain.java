package com.example.demo.dataobject;

import lombok.Data;
import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;
import org.hibernate.annotations.Proxy;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Proxy(lazy = false)
@Data
public class Examexplain {
    @Id
    private String exId;
    private String exTitle;
    private String exContent;

}
