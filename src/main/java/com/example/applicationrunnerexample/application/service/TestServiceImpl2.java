package com.example.applicationrunnerexample.application.service;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Service;

@Service
@ConditionalOnProperty(name = "service", havingValue = "TestServiceImpl2")
public class TestServiceImpl2 implements TestService {
    @Override
    public String getYourName() {
        return "Test Test Test";
    }
}
