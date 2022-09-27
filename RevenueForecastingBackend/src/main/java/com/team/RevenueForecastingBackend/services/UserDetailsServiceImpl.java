package com.team.RevenueForecastingBackend.services;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.team.RevenueForecastingBackend.models.User;
import com.team.RevenueForecastingBackend.repository.UserRepository;

@Service
public class UserDetailsServiceImpl implements UserDetailsService{
	@Autowired
	UserRepository repository;

	@Override
	@Transactional
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		// TODO Auto-generated method stub
		User user = repository.findByUsername(username).orElseThrow(
				()->new UsernameNotFoundException("user not found with id "+username)
				);
		return UserDetailsImpl.build(user);
	}

}
