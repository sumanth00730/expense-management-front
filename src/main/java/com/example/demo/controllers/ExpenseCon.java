package com.example.demo.controllers;


import com.example.demo.entities.Expense;
import com.example.demo.services.ExpenseServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin("*")
@RequestMapping("/expenses")
public class ExpenseCon {

    @Autowired
    ExpenseServices service;

    @GetMapping
    private List<Expense> get(){
        return service.listAll();
    }

    @PostMapping
    private String post(@RequestBody Expense model){
        return service.postRecord(model);
    }

    @GetMapping("/{id}")
    private Optional<Expense> getById(@PathVariable Integer Id){
        return service.showById(Id);
    }

    @DeleteMapping("/{id}")
    private String deleteById(@PathVariable Integer Id){
        return service.deleteById(Id);
    }
}

