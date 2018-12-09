package com.mmall.service;

import com.mmall.common.ServerResponse;
import com.mmall.pojo.User;

/**
 * Created by jet on 2018-12-09.
 */
public interface IUserService {
    ServerResponse<User> login(String username, String password);
}
