package com.example.demo.repository;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class DemoRepoImplTest {


    @Test
    void hello() {
        DemoRepoImpl demoRepo = new DemoRepoImpl();
        String name = "John";
        String expected = "Hello, John!";
        String result = demoRepo.hello(name);
        assertEquals(expected, result);
    }
}