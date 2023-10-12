package de.dhbw.wwieeg22spring.services;

import de.dhbw.wwieeg22spring.controller.responses.User;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Component
public class UserService {

    private Map<Long, User> usersById = new HashMap<>();

    public User createUser(Long id, String firstName, String lastName){
        User user = new User(id, firstName, lastName);
        usersById.put(id, user);
        return user;
    }


    public User getUserById(Long id) {
        return usersById.get(id);
    }

    public List<User> getAllUser() {
        List<User> collect = usersById.entrySet()
                .stream()
                .map((x) -> x.getValue())
                .collect(Collectors.toList());
        return collect;
    }

    public void deleteUser(Long id) {
        usersById.remove(id);
    }
}
