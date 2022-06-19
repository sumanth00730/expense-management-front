package com.example.demo.services;

import com.example.demo.entities.Expense;
import com.example.demo.repositories.ExpenseRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;
import java.util.Optional;

@Service
public class ExpenseServices {

    @Autowired private ExpenseRepo repo;

    public List<Expense> listAll(){
        return (List<Expense>) repo.findAll();
    }

    public String postRecord(@RequestBody Expense model){
        repo.save(model);
        return "1 record posted";
    }

    public Optional<Expense> showById(Integer Id){
        Optional<Expense> record = repo.findById(Id);
        return record;
    }

    public String deleteById(Integer Id){
        repo.deleteById(Id);
        return "record with Id:"+Id+"been deleted";
    }

}
