package com.team.RevenueForecastingBackend.controller;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.team.RevenueForecastingBackend.response.MessageResponse;

@RestController
@RequestMapping("/api/test")
public class UserController {

	@GetMapping("/all")
	public MessageResponse allAccess()
	{
		return new MessageResponse("Server is up....");
	}
	
	@GetMapping("/greeting")
    @PreAuthorize("isAuthenticated()")
	public MessageResponse userAccess()
	{
		return new MessageResponse
	            ("Congratulations! You are an authenticated user.");
	}
}
