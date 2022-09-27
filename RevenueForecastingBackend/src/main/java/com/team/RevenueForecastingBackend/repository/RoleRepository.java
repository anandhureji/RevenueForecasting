package com.team.RevenueForecastingBackend.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.team.RevenueForecastingBackend.models.ERole;
import com.team.RevenueForecastingBackend.models.Role;

@Repository
public interface RoleRepository extends JpaRepository<Role, Integer> {
	
//	Optional<Role> findByName(ERole name);

}
