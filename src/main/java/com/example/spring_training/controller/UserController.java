package com.example.spring_training.controller;

import com.example.spring_training.entity.User;
import com.example.spring_training.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "api/expl1/user")
public class UserController {

    //gets called here but is defined in the service layer.
    private final UserService userService;

    //add constructor parameter
    //@Autowired der "userService" der hier initiiert/instantiated wird, soll im Controller
    //instantiated werden, mit dem folgenden constructor:
    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping
    public List<User> getUser() {
        return userService.getUser();
    }
}
