package de.dhbw.wwieeg22spring.services;

import de.dhbw.wwieeg22spring.controller.responses.User;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

@Component
public class UserService {

    private Map<Long, User> usersById = new HashMap<>();

    public User createUser(Long id, String firstName, String lastName){
        User user = new User(id, firstName, lastName);
        usersById.put(id, user);
        return user;
    }




}
