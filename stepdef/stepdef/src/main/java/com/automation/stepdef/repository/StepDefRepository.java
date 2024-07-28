package com.automation.stepdef.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.automation.stepdef.entity.StepDef;

public interface StepDefRepository extends MongoRepository<StepDef,String> {

}
