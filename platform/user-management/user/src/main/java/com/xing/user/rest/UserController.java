package com.xing.user.rest;

import com.xing.base.response.SingleResult;
import com.xing.user.service.UserService;
import com.xing.usermodel.User;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author xiexingxing
 * @Created by 2019-11-17 22:30.
 */
@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    UserService userService;

    @RequestMapping("/{id}")
    public SingleResult<User> getById(@PathVariable Long id) {
        SingleResult<User> user = userService.findById(id);
        return user;
    }

}