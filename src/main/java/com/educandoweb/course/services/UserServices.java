package com.educandoweb.course.services;

import com.educandoweb.course.entities.User;
import com.educandoweb.course.repositories.UserRepository;
import com.educandoweb.course.services.exeptions.DataBaseExeption;
import com.educandoweb.course.services.exeptions.ResourceNotFoundExeption;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.dao.EmptyResultDataAccessException;
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
        return obj.orElseThrow(() -> new ResourceNotFoundExeption(id));
    }

    //criando operaçao para salvar usuario no banco de dados

    public User insert(User obj){
        return repository.save(obj);
    }

    //deletando id do banco de dados
    public void delete(long id){
        try {
            repository.deleteById(id);
        }catch (EmptyResultDataAccessException e){
            throw new ResourceNotFoundExeption(id);
        }catch (DataIntegrityViolationException e){
            throw new DataBaseExeption(e.getMessage());
        }
    }
    //atualizando dado usuario

    public User update(long id , User obj){
        User entity = repository.getReferenceById(id);
        updateDate(entity , obj);
        return repository.save(entity);
    }


    //update do usuario , mas estou atualizando apenas alguns nao atualizo todos tambem o get reference ele nao busca no banco de dados
    //ele fica em stage esperando ser usando assim nao quebra a integridade do banco de dados
    private void updateDate(User entity, User obj) {
        entity.setName(obj.getName());
        entity.setEmail(obj.getEmail());
        entity.setPhone(obj.getPhone());
    }

}
