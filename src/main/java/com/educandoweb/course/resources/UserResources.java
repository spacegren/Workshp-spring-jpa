package com.educandoweb.course.resources;

import com.educandoweb.course.entities.User;
import com.educandoweb.course.services.UserServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.service.annotation.GetExchange;

import java.util.List;

@RestController
@RequestMapping(value = "/users")
public class UserResources {
    @Autowired
    private UserServices services;
    @GetMapping
    public ResponseEntity<List<User>> findAll(){
        List<User> list = services.findall();
        return ResponseEntity.ok().body(list);
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<User> findyById(@PathVariable Long id){
        User obj = services.findyById(id);
        return ResponseEntity.ok().body(obj);
    }



}
