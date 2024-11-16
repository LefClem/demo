package com.example.demo.Service;

import com.example.demo.Entity.USERS;
import com.example.demo.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    public String createUser (String name, String email, String password){
        USERS n = new USERS();
        n.setName(name);
        n.setEmail(email);
        n.setPassword(password);
        n.setCreatedAt();
        n.setUpdatedAt();
        userRepository.save(n);

        return "A new user has been added to the DB";
    }
}
