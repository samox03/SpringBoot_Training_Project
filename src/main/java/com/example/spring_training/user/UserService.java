package com.example.spring_training.user;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

//To define that this piece is a bean use: @Component or for this case as its more precise: @Service
//consequence: In the controller the created userService gets recognized
@Service
public class UserService {
    @GetMapping
    public List<User> getUser(){
        return List.of(
                new User(
                        1L,
                        "Mariam",
                        "mariam.test@email.com",
                        LocalDate.of(2020, Month.JANUARY, 5),
                        21
                )
        );
    }
}
