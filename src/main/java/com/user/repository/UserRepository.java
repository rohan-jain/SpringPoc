package com.user.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.user.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{
	User findByUserId(long userid);
	User findByEmail(String email);
}
