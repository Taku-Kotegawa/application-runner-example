package com.example.applicationrunnerexample.application.service;

import org.springframework.stereotype.Service;

@Service
public class TestServiceImpl implements TestService {
    @Override
    public String getYourName() {
        return "Nanashi no gonbe";
    }
}
