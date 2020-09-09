package com.monumapp.api.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.monumapp.api.models.Monument;

@Repository
public interface MonumentRepository extends MongoRepository<Monument, String>{

}
