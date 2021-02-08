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
     * @param user {@link User}
     */
    public void createUser(User user);

    /**
     *
     * @param user {@link User}
     * @param role String
     */
    public void createUserWithRole(User user, String role);

    /**
     * Login.
     *
     * @param email String
     * @param password String
     * @return User
     */
    public User login(String email, String password);
}
