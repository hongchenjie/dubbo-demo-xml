package com.study.dubbo.userapi.service;

import com.study.dubbo.userapi.entity.User;

/**
 * Created by Administrator on 2018/3/29.
 */
public interface UserService {
    User getUserById(Integer id);
}
