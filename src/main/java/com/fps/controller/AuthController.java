package com.fps.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fps.helper.AuthHelper;
import com.fps.model.CommonResponse;
import com.fps.model.LoginRequest;
import com.fps.service.AuthService;

@RestController
@RequestMapping("/auth-serivce")
public class AuthController {

	@Autowired
	private AuthService service;

	@PostMapping("/api/v1/login")
	public ResponseEntity<CommonResponse> doLogin(@RequestBody LoginRequest request) {
		boolean isValidUser = service.isValidUser(request.getCustomerId());
		CommonResponse response = AuthHelper.formatCommonResponse(isValidUser);
		return new ResponseEntity<CommonResponse>(response, HttpStatus.OK);
	}

}
