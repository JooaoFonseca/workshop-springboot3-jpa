package com.joaodev.projectspring.config;

import java.time.Instant;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.joaodev.projectspring.entities.Category;
import com.joaodev.projectspring.entities.Order;
import com.joaodev.projectspring.entities.User;
import com.joaodev.projectspring.entities.enums.OrderStatus;
import com.joaodev.projectspring.repositories.CategoryRepository;
import com.joaodev.projectspring.repositories.OrderRepository;
import com.joaodev.projectspring.repositories.UserRepository;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {

    @Autowired
    private CategoryRepository categoryRepository;

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private OrderRepository orderRepository;

    @Override
    public void run(String... args) throws Exception {

        Category cat1 = new Category(null, "Eletronics");
        Category cat2 = new Category(null, "Books");
        Category cat3 = new Category(null, "Computers");

        categoryRepository.saveAll(Arrays.asList(cat1, cat2, cat3));
        
        User u1 = new User(null, "Maria Down", "maria@gmail.com", "989898898", "123456");
        User u2 = new User(null, "Joao Matheus", "joao@gmail.com", "7777778787", "123456");
        
        Order o1 = new Order(null, Instant.parse("2025-06-20T19:53:07Z"), OrderStatus.PAID, u1);
        Order o2 = new Order(null, Instant.parse("2025-06-20T03:20:14Z"), OrderStatus.WAITING_PAYMENT, u2);
        Order o3 = new Order(null, Instant.parse("2025-06-20T13:32:55Z"), OrderStatus.WAITING_PAYMENT, u1);


        userRepository.saveAll(Arrays.asList(u1, u2));
        orderRepository.saveAll(Arrays.asList(o1, o2, o3));

    }

}
