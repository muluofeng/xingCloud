package com.xing.service;

import com.xing.dao.UserMapper;
import com.xing.usermodel.User;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author xiexingxing
 * @Created by 2019-11-17 22:36.
 */
@Service
public class UserService {
    @Autowired
    UserMapper userMapper;

    public User findById(Long id){
        User user = userMapper.selectById(id);
        return user;
    }

}