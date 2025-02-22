package org.capstone.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class api {

    private int counter = 0;

    @GetMapping("/test")
    public String get() {
        counter++;
        System.out.println("Hello World Console = " + counter);
        return "Hello World View = " + counter;
    }


}
