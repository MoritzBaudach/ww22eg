package de.dhbw.wwieeg22spring.controller;

import de.dhbw.wwieeg22spring.controller.responses.GreetingResponse;
import de.dhbw.wwieeg22spring.services.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {
    private GreetingService greetingService;

    @Autowired
    public GreetingController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    @RequestMapping(method = RequestMethod.GET, path = "/greeting")
    public GreetingResponse greeting(@RequestParam("vorname") String firstName,
                                     @RequestParam("nachname") String lastName){


        GreetingResponse greet = greetingService.greet(firstName, lastName);
        return greet;
    }






}
