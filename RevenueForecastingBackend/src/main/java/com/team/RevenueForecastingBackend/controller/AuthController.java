package com.team.RevenueForecastingBackend.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.team.RevenueForecastingBackend.models.User;
import com.team.RevenueForecastingBackend.repository.UserRepository;
import com.team.RevenueForecastingBackend.request.LoginRequest;
import com.team.RevenueForecastingBackend.request.SignupRequest;
import com.team.RevenueForecastingBackend.response.JwtResponse;
import com.team.RevenueForecastingBackend.response.MessageResponse;
import com.team.RevenueForecastingBackend.security.JwtUtils;
import com.team.RevenueForecastingBackend.services.UserDetailsImpl;

@RestController
@RequestMapping("/api/auth")
public class AuthController {
	
	@Autowired
	AuthenticationManager authenticationManager;
	
	@Autowired
	UserRepository repository;
	
	@Autowired
	PasswordEncoder encoder;
	
	@Autowired
	JwtUtils jwtUtils;
	
	
	@PostMapping("/signin")
	public ResponseEntity<?> authenticateuser(@RequestBody LoginRequest loginRequest)
	{
		Authentication authentication = authenticationManager.authenticate(
				new UsernamePasswordAuthenticationToken(
						loginRequest.getUsername(), loginRequest.getPassword()));
		
		SecurityContextHolder.getContext().setAuthentication(authentication);
		String jwt = jwtUtils.generateJwtToken(authentication);
		
		UserDetailsImpl detailsImpl = (UserDetailsImpl) authentication.getPrincipal();
		
		return ResponseEntity.ok(new JwtResponse(jwt, detailsImpl.getId(), 
				detailsImpl.getUsername(), detailsImpl.getEmail()));
		
	}
	
	@PostMapping("/register")
	public ResponseEntity<?> registerUser(@RequestBody SignupRequest request)
	{
		if(repository.existsByUsername(request.getUsername()))
		{
			return ResponseEntity.badRequest().body(
					new MessageResponse("Error:UserId already exists"));
		}
		
		if (repository.existsByEmail(request.getEmail())) 
		{

			return ResponseEntity.badRequest()
			.body(new MessageResponse
					("Error: Email is already in use!"));
		}
		
		 User user = new User(request.getUsername(), 
                 request.getEmail(),
                 encoder.encode(request.getPassword()));
		 
		 			repository.save(user);

		 			return ResponseEntity
		 			.ok(new MessageResponse("user registered successfully!"));
		
	}
	
	

}
