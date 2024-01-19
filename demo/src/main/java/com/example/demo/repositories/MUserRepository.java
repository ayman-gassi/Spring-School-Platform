package com.example.demo.repositories;

import com.example.demo.models.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MUserRepository extends MongoRepository<User, String> {
    User findByEmail(String email);
}

