package com.example.applicationrunnerexample.application.service;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Service;

@Service
@ConditionalOnProperty(name = "service", havingValue = "TestServiceImpl")
public class TestServiceImpl implements TestService {
    @Override
    public String getYourName() {
        return "Nanashi no gonbe";
    }
}
