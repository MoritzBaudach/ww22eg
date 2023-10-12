package de.dhbw.wwieeg22spring.controller.requests;

import com.fasterxml.jackson.annotation.JsonProperty;

public class UserRequest {
    private Long id;
    private String firstName;
    @JsonProperty("nachname")
    private String lastName;


    public UserRequest() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
