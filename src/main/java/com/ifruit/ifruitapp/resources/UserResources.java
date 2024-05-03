package com.ifruit.ifruitapp.resources;

import com.ifruit.ifruitapp.entities.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/users")
public class UserResources {
    @GetMapping
    public ResponseEntity<User> findAll(){
        User user = new User(1L, "Matheus", "matheus@gmail.com", "4399999999", "mat123456");
        return ResponseEntity.ok().body(user);
    }
}
