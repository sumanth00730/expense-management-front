package com.example.demo.services;

import com.example.demo.entities.User;
import com.example.demo.repositories.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;
import java.util.Optional;
//User Service
@Service
public class UserServices {
    @Autowired
    private UserRepo repo;

    public List<User> listAll(){
        return (List<User>) repo.findAll();
    }

    public String postRecord(@RequestBody User model){
        repo.save(model);
        return "1 record posted";
    }

    public Optional<User> showById(Integer Id){
        Optional<User> record = repo.findById(Id);
        return record;
    }

    public String deleteById(Integer Id){
        repo.deleteById(Id);
        return "record with Id:"+Id+"been deleted";
    }
}
