package com.example.demo.exception;

import com.example.demo.enums.ResultEnum;
import lombok.Getter;

@Getter
public class AdminException extends RuntimeException{
    private Integer code;

    public AdminException(Integer code,String message){
        super(message);
        this.code=code;
    }

    public AdminException(ResultEnum resultEnum){
        super(resultEnum.getMessage());
        this.code=resultEnum.getCode();
    }

}





















