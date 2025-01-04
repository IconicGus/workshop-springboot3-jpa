package com.iconicgus.springboot.repositories;

import com.iconicgus.springboot.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

}
