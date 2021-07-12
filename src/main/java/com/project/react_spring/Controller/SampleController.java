package com.project.react_spring.Controller;


import com.project.react_spring.Handler.SampleHandler;
import com.project.react_spring.Models.Accounts;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping(value = "/api")
public class SampleController {

    @Autowired
    public SampleHandler sampleHandler;

    @GetMapping(value="/find")
    public List<Accounts> listAll(){
        return sampleHandler.getAll();

    }
    @PostMapping(value="/save")
    public Accounts saveSample(){
        return sampleHandler.saveSample();
    }


}
