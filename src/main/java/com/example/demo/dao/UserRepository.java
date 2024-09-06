package com.example.demo.dao;


import com.example.demo.model.User;
import org.springframework.data.jpa.repository.JpaRepository;


public interface UserRepository extends JpaRepository<User, Long> {
    // 你可以添加额外的查询方法
    User findByUsernameAndAndPassword(String username,String password);
    User findByUsername(String username);
}
