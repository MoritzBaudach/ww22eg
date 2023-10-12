package de.dhbw.wwieeg22spring.controller;

import de.dhbw.wwieeg22spring.controller.requests.UserRequest;
import de.dhbw.wwieeg22spring.controller.responses.User;
import de.dhbw.wwieeg22spring.services.UserService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

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

    @GetMapping("/users/{userid}")
    public User getUser(@PathVariable("userid") Long id){
        return userService.getUserById(id);
    }


    @GetMapping("/users")
    public List<User> getAllUsers(){
        return userService.getAllUser();
    }


    @DeleteMapping("/users/{userid}")
    public void deleteUser(@PathVariable(value = "userid") Long id){
        userService.deleteUser(id);
    }


    @PutMapping("/users/{userid}")
    public User modifyUser(@PathVariable(value = "userid") Long id,
                           @RequestParam(value = "firstName", required = false) String firstName,
                           @RequestParam(value = "lastName", required = false) String lastName){
        return userService.modifyUser(id, firstName, lastName);
    }








}
