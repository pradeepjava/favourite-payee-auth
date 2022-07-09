package com.fps.repo;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fps.model.Customer;

public interface AuthRepository extends JpaRepository<Customer, Long>{

	

}
