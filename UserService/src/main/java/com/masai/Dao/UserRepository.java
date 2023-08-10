package com.masai.Dao;

import com.masai.Entities.Users;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<Users, String> {
	Optional<Users> findByEmail(String email);
}
