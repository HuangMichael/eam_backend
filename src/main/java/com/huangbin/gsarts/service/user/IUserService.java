package com.huangbin.gsarts.service.user;

import com.huangbin.gsarts.model.user.User;

import java.util.List;

/**
 * 用户信息接口
 */
public interface IUserService {

    /**
     * @return 查询所有的用户
     */
    List<User> findAll();

    /**
     * @param id
     * @return 根据ID查询用户
     */
    User findById(Long id);
}
