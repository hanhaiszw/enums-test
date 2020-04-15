package com.example.enumstest.enums;

import lombok.Getter;

/**
 * create by sunzhongwei on 2020/04/15
 * Desc:
 */

public enum Fruit implements BaseEnum {
    APPLE(10,"苹果"),
    BANANA(1,"香蕉"),
    ORANGE(2,"橘子");

    private Integer code;
    private String description;

    Fruit(int code, String description) {
        this.code = code;
        this.description = description;
    }

    @Override
    public Integer getCode() {
        return this.code;
    }

    public String getDescription() {
        return description;
    }

    @Override
    public String toString() {
        return this.description;
    }
}
