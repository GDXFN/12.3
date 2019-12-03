package com.example.demo.enums;

import lombok.Getter;

@Getter
public enum ResultEnum {
    LOGIN_FAIL(1,"登录错误") ;
    private  Integer code;
    private  String message;
    ResultEnum(Integer code, String message) {
        this.code = code;
        this.message = message;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
