package com.luv2code.springcoredemo.common;

import org.springframework.stereotype.Component;

@Component
public class BaseBallCoach implements Coach{
    @Override
    public String getWorkOutDetails() {
        return "Practise batting for 30 minutes";
    }
}
