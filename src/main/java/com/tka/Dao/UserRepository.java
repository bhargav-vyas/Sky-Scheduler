package com.tka.Dao;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tka.Model.Users;



public interface UserRepository extends JpaRepository<Users, Long> {

	Optional<Users> findByUsername(String username);

}
