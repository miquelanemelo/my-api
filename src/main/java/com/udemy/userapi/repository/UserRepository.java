package com.udemy.userapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.udemy.userapi.domain.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
	
	

}
