package org.capstone.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

import java.util.Map;

@Controller
public class PageController {

    @RequestMapping("/")
    public String index(Model model) {
        return "index.html";
    }
}

@RestController
@RequestMapping("/api")
class ApiController {

    @GetMapping("/data")
    public Map<String, String> getData() {
        return Map.of("message", "Spring Boot와 연결되었습니다!");
    }
}
