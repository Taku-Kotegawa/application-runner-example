package com.example.applicationrunnerexample.application.service;

import org.springframework.stereotype.Service;

@Service
public class TestServiceImpl2 implements TestService {
    @Override
    public String getYourName() {
        return "Test Test Test";
    }
}
