package de.dhbw.wwieeg22spring.services;

import de.dhbw.wwieeg22spring.controller.responses.GreetingResponse;

import java.util.ArrayList;
import java.util.List;

public class GreetingService {

    private List<String> greetings;
    private int cursor = 0;


    public GreetingService(){
        this.greetings = new ArrayList<>();
        this.greetings.add("Hallo");
    }


    public void addGreeting(String greeting) {
        this.greetings.add(greeting);
    }

    public GreetingResponse greet(String firstName, String lastName){
        GreetingResponse greetingResponse = new GreetingResponse();
        greetingResponse.setFirstName(firstName);
        greetingResponse.setLastName(lastName);
        greetingResponse.setImportance(randomLong());
        String nextBestGreeting = getNextBestGreeting();
        if(null == nextBestGreeting){
            nextBestGreeting =greetings.get(0);
        }
        greetingResponse.setGreetingText(nextBestGreeting);
        return greetingResponse;
    }

    private String getNextBestGreeting(){
        for (int i = 0 ; i < greetings.size(); i++) {
            if(cursor > greetings.size()){
                cursor = 0;
            }
            if(cursor == i){
                return greetings.get(cursor++);
            }
        }
        return null;
    }

    private Long randomLong(){
         return System.currentTimeMillis();
    }


    public List<String> getGreetings() {
        return this.greetings;
    }
}
