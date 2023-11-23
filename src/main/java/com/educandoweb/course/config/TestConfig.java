package com.educandoweb.course.config;

import com.educandoweb.course.entities.Category;
import com.educandoweb.course.entities.Order;
import com.educandoweb.course.entities.User;
import com.educandoweb.course.entities.enums.OrderStatus;
import com.educandoweb.course.repositories.CategoryRepository;
import com.educandoweb.course.repositories.OrderRepository;
import com.educandoweb.course.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import java.time.Instant;
import java.util.Arrays;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {
    ///quando um serviço depende de outro a dependencia tem que ser fraca desacoplada
    //testaando erro de conflito git bashhereee

    @Autowired
    private UserRepository userRepository;
    @Autowired
    private OrderRepository orderRepository;

    @Autowired
    private CategoryRepository categoryRepository;

    //tudo que colocar dentro desse metodo vai ser exexutado quando aplicaçao iniciada
    @Override
    public void run(String... args) throws Exception {

        Category ca1 = new Category(null , "Eletronics");
        Category cat2 = new Category(null , "Books");
        Category cat3 = new Category(null , "Computers");

        categoryRepository.saveAll(Arrays.asList(ca1 , cat2, cat3));
        ///////////////////////////////////////////////////////////////////////

        User u1 = new User(null , "nicacio pereira" , "nicacio@gmail.com" , "777777777777" , "7777777");
        User u2 = new User(null , "nala eao" , "nalaoeao@gmail.com", "12121212" , "1234");

        Order o1 = new Order(null , Instant.parse("2023-11-22T20:27:07Z") , OrderStatus.PAID , u1);
        Order o2 = new Order(null , Instant.parse("2023-11-21T20:28:08Z"),OrderStatus.WAITING_PAYMENT , u2);
        Order o3 = new Order(null , Instant.parse("2022-12-12T00:00:00Z") , OrderStatus.WAITING_PAYMENT, u1);



        userRepository.saveAll(Arrays.asList(u1 , u2));
        orderRepository.saveAll(Arrays.asList(o1,o2,o3));

    }
}