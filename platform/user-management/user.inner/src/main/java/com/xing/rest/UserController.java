package com.xing.rest;

import com.xing.base.response.SingleResult;
import com.xing.service.UserService;
import com.xing.usermodel.User;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
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

    @RequestMapping("/findOne")
    public SingleResult getById(@RequestParam("id") Long id) {
        User user = userService.findById(id);
        return SingleResult.ok(user);
    }

}