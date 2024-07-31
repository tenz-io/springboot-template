package com.example.demo.repository;

import org.springframework.stereotype.Component;

@Component
public class DemoRepoImpl implements DemoRepo {
    @Override
    public String hello(String name) {
        return "Hello, " + name + "!";
    }
}
