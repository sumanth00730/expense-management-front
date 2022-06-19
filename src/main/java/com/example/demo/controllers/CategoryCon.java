package com.example.demo.controllers;

import com.example.demo.entities.Category;
import com.example.demo.services.CategoryServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin("*")
@RequestMapping("/category")
public class CategoryCon {

    @Autowired
    CategoryServices service;

    @GetMapping
    private List<Category> get(){
        return service.listAll();
    }

    @PostMapping
    private String post(@RequestBody Category model){
        return service.postRecord(model);
    }

    @GetMapping("/{id}")
    private Optional<Category> getById(@PathVariable Integer Id){
        return service.showById(Id);
    }

    @DeleteMapping("/{id}")
    private String deleteById(@PathVariable Integer Id){
        return service.deleteById(Id);
    }
}

