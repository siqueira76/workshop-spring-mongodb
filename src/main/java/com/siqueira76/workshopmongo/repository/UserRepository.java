package com.siqueira76.workshopmongo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.siqueira76.workshopmongo.domain.User;

public interface UserRepository extends MongoRepository<User, String> {

}
