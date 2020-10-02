package com.policy.service.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.policy.service.model.Policy;

public interface PolicyRepository extends MongoRepository<Policy, String> {

}
