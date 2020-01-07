package com.xing.user.service.impl;

import com.xing.base.response.CommonCode;
import com.xing.base.response.SingleResult;
import com.xing.user.service.UserService;

import org.springframework.stereotype.Component;

/**
 * @author xiexingxing
 * @Created by 2020-01-07 09:27.
 */
@Component
public class UserServiceFail implements UserService {

    @Override
    public SingleResult findById(Long id) {
        return new SingleResult(CommonCode.FAIL,null);
    }
}