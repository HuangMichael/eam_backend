package com.huangbin.eam.service.user;

import com.huangbin.eam.model.user.User;

import java.util.List;

/**
 * 用户信息接口
 */
public interface IUserService {

    /**
     * @return 查询所有的用户
     */
    List<User> findAll();
}
