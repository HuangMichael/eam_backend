package com.huangbin.eam.service.user;


import com.huangbin.eam.model.user.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * 用户信息服务
 */
@Service
public class UserService implements IUserService {


    @Override
    public List<User> findAll() {
        List<User> userList = new ArrayList<>();
        for (int i = 0; i < 10; i++) {

            userList.add(new User((long) (i + 1), "user" + i, "123456", "1"));
        }
        return userList;
    }
}
