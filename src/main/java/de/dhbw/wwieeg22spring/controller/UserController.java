package de.dhbw.wwieeg22spring.controller;

import de.dhbw.wwieeg22spring.controller.requests.UserRequest;
import de.dhbw.wwieeg22spring.controller.responses.User;
import de.dhbw.wwieeg22spring.services.UserService;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    public UserController(UserService userService) {
        this.userService = userService;
    }

    private final UserService userService;

    @RequestMapping(method = RequestMethod.POST, path = "/users")
    public User createUser(@RequestBody UserRequest request){
        User user = userService.createUser(
                request.getId(),
                request.getFirstName(),
                request.getLastName()
        );
        return user;
    }






}
