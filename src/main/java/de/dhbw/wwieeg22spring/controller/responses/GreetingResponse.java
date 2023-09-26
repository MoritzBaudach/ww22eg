package de.dhbw.wwieeg22spring.controller.responses;

import lombok.Data;

public class GreetingResponse {
    private String greetingText;
    private Long importance;

    private String firstName;

    private String lastName;


    public GreetingResponse(String greetingText, Long importance, String firstName, String lastName) {
        this.greetingText = greetingText;
        this.importance = importance;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public GreetingResponse() {
    }

    public String getGreetingText() {
        return greetingText;
    }

    public void setGreetingText(String greetingText) {
        this.greetingText = greetingText;
    }

    public Long getImportance() {
        return importance;
    }

    public void setImportance(Long importance) {
        this.importance = importance;
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
