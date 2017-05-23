package Service;

import Model.User;
import Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Aurel on 5/22/17.
 */

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public User getUserById(Long id){
        return userRepository.findById(id);
    }

    public List<User> getUsers(){
        return userRepository.findAll();
    }


    public User createUser(User user){
       return userRepository.save(user);
    }



}
