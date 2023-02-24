package com.studiostg.course.resources;

import com.studiostg.course.entities.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/users")
public class UserResource {

    @GetMapping
    public ResponseEntity<User> findAll() {
        User u = new User(
                1L,
                "Jefferson",
                "jefferoidtex7@gmail.com",
                "+5511986983341",
                "password123"
        );
        return ResponseEntity.ok().body(u);
    }
}
