package com.glodon.demo.mybatis.dtos;

import com.glodon.demo.mybatis.models.Sex;

import java.util.Date;

public class UserProps {
    private String name;
    private Sex sex;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Sex getSex() {
        return sex;
    }

    public void setSex(Sex sex) {
        this.sex = sex;
    }
}
