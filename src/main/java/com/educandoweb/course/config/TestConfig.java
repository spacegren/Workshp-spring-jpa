package com.educandoweb.course.config;

import com.educandoweb.course.entities.User;
import com.educandoweb.course.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import java.util.Arrays;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {
    ///quando um serviço depende de outro a dependencia tem que ser fraca desacoplada
    //testaando erro de conflito git bashhereee

    @Autowired
    private UserRepository userRepository;

    //tudo que colocar dentro desse metodo vai ser exexutado quando aplicaçao iniciada
    @Override
    public void run(String... args) throws Exception {

        User u1 = new User(null , "nicacio pereira" , "nicacio@gmail.com" , "777777777777" , "7777777");
        User u2 = new User(null , "nala eao" , "nalaoeao@gmail.com", "12121212" , "1234");

        userRepository.saveAll(Arrays.asList(u1 , u2));

    }
}