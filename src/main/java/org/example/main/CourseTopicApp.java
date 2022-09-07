package org.example.main;


import org.example.controllers.Controller;
import org.example.services.TopicService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackageClasses = Controller.class)
@ComponentScan(basePackageClasses = TopicService.class)
public class CourseTopicApp {
    public static void main(String[] args) {
        SpringApplication.run(CourseTopicApp.class, args);
    }
}