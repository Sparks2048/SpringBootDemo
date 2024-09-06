package com.example.demo.service;


import com.example.demo.dao.UserRepository;
import com.example.demo.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class UserService  {

    @Autowired
    private UserRepository userRepository;

    public User registerUser(User user) {
        // 这里你可以添加更多的业务逻辑，如密码加密等
        if (userRepository.findByUsername(user.getUsername()) != null) {
             throw new IllegalArgumentException("Username already exists");
        }
        return userRepository.save(user);
    }
    public Map loadUserByUsername(User user) throws Exception {
        User byUsernameAndAndPassword = userRepository.findByUsernameAndAndPassword(user.getUsername(), user.getPassword());
        HashMap<Object, Object> map = new HashMap<>();
        if (byUsernameAndAndPassword == null) {
            map.put("retCode","-1");
            map.put("retMsg","登录失败");
            return map;
        }
        map.put("retCode","0");
        map.put("retMsg","登录成功");
        return map;
    }
}
