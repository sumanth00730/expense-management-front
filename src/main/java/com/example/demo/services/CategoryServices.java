package com.example.demo.services;

import com.example.demo.entities.Category;
import com.example.demo.repositories.CategoryRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;


import java.util.List;
import java.util.Optional;
@Service
public class CategoryServices {
    @Autowired
    private CategoryRepo repo;

    public List<Category> listAll(){
        return (List<Category>) repo.findAll();
    }

    public String postRecord(@RequestBody Category model){
        repo.save(model);
        return "1 record posted";
    }

    public Optional<Category> showById(Integer Id){
        Optional<Category> record = repo.findById(Id);
        return record;
    }

    public String deleteById(Integer Id){
        repo.deleteById(Id);
        return "record with Id:"+Id+"been deleted";
    }
}
