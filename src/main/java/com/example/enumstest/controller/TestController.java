package com.example.enumstest.controller;

import com.example.enumstest.bo.Person;
import com.example.enumstest.enums.Fruit;
import org.springframework.web.bind.annotation.*;

/**
 * create by sunzhongwei on 2020/04/15
 * Desc:
 */
@RestController
public class TestController {

    @GetMapping("/test1")
    public String test1(@RequestParam Fruit fruit){
        return fruit.getDescription();
    }

    @PostMapping("/test2")
    public String test2(@RequestBody Person person){
        return person.toString();
    }
}
