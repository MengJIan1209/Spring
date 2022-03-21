package com.meng.spring.dao;

import com.meng.spring.pojo.SysUser;
import org.springframework.stereotype.Repository;

@Repository("mysqlDao")
public class MySqlUserDAO implements UserDAO{
    @Override
    public void insertUser(SysUser user) {
        System.out.println("===使用了DAO执行了insert操作===");
    }
}
