package com.workintech.S17C.entity;

import org.springframework.stereotype.Component;

@Component
public class LowCourseGpa implements CourseGpa {
    @Override
    public int getGpa() {
        return 3;
    }
}