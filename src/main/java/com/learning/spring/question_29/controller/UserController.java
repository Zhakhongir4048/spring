package com.learning.spring.question_29.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/users")
public class UserController {

    @GetMapping
    public List<String> users() {
        return List.of("Дурак", "Умник");
    }

}