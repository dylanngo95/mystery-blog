package com.mysteryvn.blog.user.service;

import com.mysteryvn.blog.user.model.User;

import java.util.List;

public interface UserService {

    /**
     * Get User By Email.
     *
     * @param email String
     * @return List<User>
     */
    public List<User> getUserByEmail(String email);

    /**
     * Create User.
     *
     * @param user User
     */
    public void createUser(User user);

    /**
     * Login.
     *
     * @param email String
     * @param password String
     * @return User
     */
    public User login(String email, String password);
}
