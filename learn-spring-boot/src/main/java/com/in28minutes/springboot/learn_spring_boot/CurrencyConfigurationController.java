package com.in28minutes.springboot.learn_spring_boot;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class CurrencyConfigurationController {

    @RequestMapping("/courses")
    public List<Course> retrieveCourses() {
        return Arrays.asList(
                new Course(1L, "AWS", "in28minutes"),
                new Course(2L, "AWS", "in28minutes"),
                new Course(3L, "GCP", "in28minutes")
//                new Course(3L, "GCP", "in28minutes")
        );
    }
}
