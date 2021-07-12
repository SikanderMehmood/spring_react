package com.project.react_spring.Service;

import com.project.react_spring.Models.Accounts;
import com.project.react_spring.Models.Sample;
import com.project.react_spring.Repository.SampleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class SampleService {

    @Autowired
    public SampleRepository sampleRepository;

    public List<Accounts> getAll() {
    return sampleRepository.findAll();
    }

    public Accounts saveSample(Accounts sample) {
     return sampleRepository.save(sample);
    }
}
