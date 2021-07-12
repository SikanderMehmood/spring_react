package com.project.react_spring.Models;

import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Sample {

    public String username;
    public String firstName;
    public int states;

    public Sample() {
    }

    public Sample(String username, String firstName, int states) {
        this.username = username;
        this.firstName = firstName;
        this.states = states;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public int getStates() {
        return states;
    }

    public void setStates(int states) {
        this.states = states;
    }
}
