package com.joaodev.projectspring.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.joaodev.projectspring.entities.User;
import com.joaodev.projectspring.repositories.UserRepository;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {

    @Autowired
    private UserRepository userRepository;

    @Override
    public void run(String... args) throws Exception {
        
        User u1 = new User(null, "Maria Down", "maria@gmail.com", "989898898", "123456");
        User u2 = new User(null, "Joao Matheus", "joao@gmail.com", "7777778787", "123456");

        userRepository.saveAll(Arrays.asList(u1, u2));

    }

}
