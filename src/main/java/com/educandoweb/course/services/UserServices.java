package com.educandoweb.course.services;

import com.educandoweb.course.entities.User;
import com.educandoweb.course.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class UserServices {
    @Autowired
    private UserRepository repository;
    public List<User> findall(){
        return repository.findAll();
    }
    public User findyById(Long id){
        Optional<User> obj = repository.findById(id);
        return obj.get();
    }

    //criando operaçao para salvar usuario no banco de dados

    public User insert(User obj){
        return repository.save(obj);
    }

    //deletando id do banco de dados
    public void delete(long id){
        repository.deleteById(id);
    }
}
