package com.example.demo.service;

import com.example.demo.repository.DemoRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("demoService")
public class DemoServiceImpl implements DemoService {
    @Autowired
    private DemoRepo demoRepo;

    @Override
    public String hello(String name) {
        return demoRepo.hello(name);
    }
}
