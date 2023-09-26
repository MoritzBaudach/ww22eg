package de.dhbw.wwieeg22spring.controller;

import de.dhbw.wwieeg22spring.services.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class GreetingManagerController {

    private final GreetingService greetingService;

    @Autowired
    public GreetingManagerController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    @PostMapping( path = "/greetings")
    public void createGreeting(@RequestParam("greeting") String greeting){
        greetingService.addGreeting(greeting);
    }


    @RequestMapping(method = RequestMethod.GET, path = "/greetings")
    public List<String> getGreetings(){
        return greetingService.getGreetings();
    }

}
