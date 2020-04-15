package com.example.enumstest.bo;

import com.example.enumstest.enums.Fruit;
import lombok.Data;

/**
 * create by sunzhongwei on 2020/04/15
 * Desc:
 */
@Data
public class Person {
    private String name;
    private Fruit fruit;
}
