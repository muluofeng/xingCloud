package com.xing.user.service;

import com.xing.base.response.SingleResult;
import com.xing.user.service.impl.UserServiceFail;
import com.xing.usermodel.User;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


/**
 * @author xiexingxing
 * @Created by 2020-01-06 17:47.
 */
@FeignClient(value = "userservice", fallback = UserServiceFail.class)
public interface UserService {
     @GetMapping(value = "/user/findOne")
     SingleResult<User> findById(@RequestParam("id")Long id);
}
