package com.xkcoding.log.aop.service.impl;

import com.xkcoding.log.aop.service.UserService;
import org.springframework.stereotype.Service;


@Service("userService")
public class UserServiceImpl implements UserService {

    @Override
    public void add() {
        System.err.println("创建用户。。。。。");
    }
}
