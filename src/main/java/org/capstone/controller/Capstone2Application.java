package org.capstone.controller;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

@ServletComponentScan
@SpringBootApplication
public class Capstone2Application {
    public static void main(String[] args) {
        SpringApplication.run(Capstone2Application.class, args);
    }
}
