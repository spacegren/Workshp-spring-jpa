package com.educandoweb.course.services;

import com.educandoweb.course.entities.Product;
import com.educandoweb.course.entities.User;
import com.educandoweb.course.repositories.ProductRepository;
import com.educandoweb.course.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService {

    @Autowired
    private ProductRepository repository;
    public List<Product> findall(){
        return repository.findAll();
    }
    public Product findyById(Long id){
        Optional<Product> obj = repository.findById(id);
        return obj.get();
    }

}
