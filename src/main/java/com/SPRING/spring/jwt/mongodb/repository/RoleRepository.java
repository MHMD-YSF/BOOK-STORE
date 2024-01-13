package com.SPRING.spring.jwt.mongodb.repository;

import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.SPRING.spring.jwt.mongodb.models.ERole;
import com.SPRING.spring.jwt.mongodb.models.Role;
import org.springframework.stereotype.Repository;


public interface RoleRepository extends MongoRepository<Role, String> {
  Optional<Role> findByName(ERole name);
}
