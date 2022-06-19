package com.example.demo.controllers;

import com.example.demo.entities.User;
import com.example.demo.services.UserServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin("*")
@RequestMapping("/users")
public class UserCon {

    @Autowired
    UserServices service;

    @GetMapping
    private List<User> get(){
        return service.listAll();
    }

    @PostMapping
    private String post(@RequestBody User model){
        return service.postRecord(model);
    }

    @GetMapping("/{id}")
    private Optional<User> getById(@PathVariable Integer Id){
        return service.showById(Id);
    }

    @DeleteMapping("/{id}")
    private String deleteById(@PathVariable Integer Id){
        return service.deleteById(Id);
    }
}

