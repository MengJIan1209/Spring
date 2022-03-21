package com.meng.spring.service.impl;

import com.meng.spring.dao.MySqlUserDAO;
import com.meng.spring.dao.UserDAO;
import com.meng.spring.pojo.SysUser;
import com.meng.spring.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service("userService")
public class UserServiceImpl implements UserService {

    @Resource
    private UserDAO userDAO = null;

    @Override
    public void addUser(SysUser user) {
        userDAO.insertUser(user);
    }
}
