package Controller;

import Model.User;
import Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by Aurel on 5/22/17.
 */
@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("/user")
    public User getUserById(@RequestParam("id") Long id) {
        return userService.getUserById(id);
    }

    @RequestMapping("/users")
    public List<User> getUsers(){
        return userService.getUsers();
    }

    @PostMapping(value = "/createUser", produces = {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_ATOM_XML_VALUE})
    public User createUser(@RequestBody User user){
        return userService.createUser(user);
    }


}
