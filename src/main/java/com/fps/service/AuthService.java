package com.fps.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fps.model.Customer;
import com.fps.repo.AuthRepository;

@Service
public class AuthService {

	@Autowired
	private AuthRepository repository;

	public boolean isValidUser(long customerId) {
		Optional<Customer> customer = repository.findById(customerId);
		return customer.isPresent() ? true : false;
	}
}
