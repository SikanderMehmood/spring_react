package com.project.react_spring.Handler;

import com.project.react_spring.Models.Accounts;
import com.project.react_spring.Models.Sample;
import com.project.react_spring.Service.SampleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class SampleHandler {

    @Autowired
    public SampleService sampleService;

    public List<Accounts> getAll() {
     return sampleService.getAll();
    }

    public Accounts saveSample() {
        List<String> list = new ArrayList();
        Accounts sample = new Accounts(12,12,list);
        return sampleService.saveSample(sample);
    }
}
