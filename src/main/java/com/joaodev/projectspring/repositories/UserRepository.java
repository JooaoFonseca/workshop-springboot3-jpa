package com.joaodev.projectspring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.joaodev.projectspring.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
