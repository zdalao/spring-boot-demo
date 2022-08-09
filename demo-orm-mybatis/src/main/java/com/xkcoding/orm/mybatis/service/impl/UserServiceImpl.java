package com.xkcoding.orm.mybatis.service.impl;
import java.util.Date;

import com.xkcoding.orm.mybatis.entity.User;
import com.xkcoding.orm.mybatis.mapper.UserMapper;
import com.xkcoding.orm.mybatis.service.UserService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


@Service("userService")
public class UserServiceImpl implements UserService {

    @Resource
    private UserMapper userMapper;

    @Override
    @Transactional(propagation = Propagation.REQUIRED,rollbackFor = Exception.class)
    public void add() {
        System.err.println("创建用户。。。。。");
        User user = new User();
        //user.setId(1L);
        user.setName("tom_12323");
        user.setPassword("123");
        user.setSalt("123");
        user.setEmail("123");
        user.setPhoneNumber("123");
        user.setStatus(1);
        user.setCreateTime(new Date());
        user.setLastLoginTime(new Date());
        user.setLastUpdateTime(new Date());
        userMapper.saveUser(user);
        throw new IllegalArgumentException("error");
    }
}
