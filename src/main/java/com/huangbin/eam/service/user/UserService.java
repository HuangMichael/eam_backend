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
    static List<User> userList;

    static {
        userList = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            userList.add(new User((long) (i + 1), "user" + i, "123456", "1"));
        }
    }


    @Override
    public List<User> findAll() {

        return userList;
    }

    /**
     * @param id 用户ID
     * @return 根据用户id查询
     */
    @Override
    public User findById(Long id) {
        User user = null;
        for (User u : userList) {
            if (u.getId() == id) {
                user = u;
            }
        }
        return user;
    }
}
