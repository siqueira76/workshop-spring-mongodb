package com.siqueira76.workshopmongo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.siqueira76.workshopmongo.domain.User;


@Repository
public interface UserRepository extends MongoRepository<User, String> {

}
