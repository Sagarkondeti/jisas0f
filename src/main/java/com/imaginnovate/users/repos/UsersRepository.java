package com.imaginnovate.users.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.imaginnovate.users.models.Users;

@Repository
public interface UsersRepository extends JpaRepository<Users, Integer> {
	
}     
