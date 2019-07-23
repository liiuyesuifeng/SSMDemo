package com.cat.service.user.impl;

import com.cat.dao.UserMapper;
import com.cat.domain.User;
import com.cat.service.user.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;


@Service("userService")
public class UserServiceImpl implements UserService{
    @Resource
    private UserMapper userDao;
    @Override
    public User getUser(Integer uid) {
        String aa = "\\|";
       return userDao.selectByPrimaryKey(uid);
    }
}
