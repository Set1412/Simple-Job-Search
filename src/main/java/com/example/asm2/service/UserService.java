package com.example.asm2.service;

import com.example.asm2.model.User;
import com.example.asm2.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserRepository repo;


    public int getUserCount() {
        List<User> users = repo.findAll();

        return users.size();
    }
}
