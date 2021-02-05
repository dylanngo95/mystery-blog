package com.mysteryvn.blog.user.repository;

import com.mysteryvn.blog.user.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

    public List<User> findByEmailAndPassword(String email, String password);

    public List<User> findByEmail(String email);
}
