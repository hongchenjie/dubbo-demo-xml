package com.study.dubbo.user.service;

import com.study.dubbo.userapi.service.UserService;
import com.study.dubbo.userapi.entity.User;
import org.springframework.stereotype.Service;

/**
 * Created by Administrator on 2018/3/29.
 */
public class UserServiceImpl implements UserService {
    @Override
    public User getUserById(Integer id) {
        User u = new User(1, "lipo");
        return u;
    }
}
