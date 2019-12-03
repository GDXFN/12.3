package com.example.demo.dataobject;

import lombok.Data;
import org.hibernate.annotations.Proxy;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Proxy(lazy = false)
@Data
public class Introduction {
    @Id
    private String iId;
    private String iTitle;
    private String iContent;
}
