package com.example.demo.repository;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
@ContextConfiguration(classes = DemoRepoImpl.class)
class DemoRepoImplTest {

    @Autowired
    private DemoRepoImpl demoRepo;

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void hello() {
        String name = "John";
        String expected = "Hello, John!";
        String result = demoRepo.hello(name);
        assertEquals(expected, result);
    }
}