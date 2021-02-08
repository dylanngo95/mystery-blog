package com.mysteryvn.blog.user.service;

import com.mysteryvn.blog.role.repository.RoleRepository;
import com.mysteryvn.blog.user.model.Role;
import com.mysteryvn.blog.user.model.User;
import com.mysteryvn.blog.user.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.ArrayList;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public List<User> getUserByEmail(String email) {
        return this.userRepository.findByEmail(email);
    }

    @Override
    public void createUser(User user) {
        this.userRepository.save(user);
    }

    @Override
    public void createUserWithRole(User user, String role1) {


    }

    @Override
    public User login(String email, String password) {
        List<User> users = this.userRepository.findByEmail(email);
        if (users.stream().count() > 0) {
            if (users.get(0).getPassword().equals(password)) {
                return users.get(0);
            }
        }
        return null;
    }
}
