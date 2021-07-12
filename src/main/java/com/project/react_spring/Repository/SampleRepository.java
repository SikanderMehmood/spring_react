package com.project.react_spring.Repository;

import com.project.react_spring.Models.Accounts;
import com.project.react_spring.Models.Sample;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Component;

@Component
public interface SampleRepository extends MongoRepository<Accounts, String> {
}
