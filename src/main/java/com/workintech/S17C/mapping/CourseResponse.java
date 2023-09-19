package com.workintech.S17C.mapping;

import com.workintech.S17C.entity.Course;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CourseResponse {
    private Course course;
    private double totalGpa;
}
