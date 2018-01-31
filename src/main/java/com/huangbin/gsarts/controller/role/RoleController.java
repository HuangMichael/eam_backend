package com.huangbin.gsarts.controller.role;


import com.huangbin.gsarts.controller.base.BaseController;

import com.huangbin.gsarts.model.role.Role;
import com.huangbin.gsarts.service.role.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * 角色控制器
 */
@RestController
@RequestMapping(value = "/role")
public class RoleController extends BaseController {

    @Autowired
    RoleService roleService;


    /**
     * @return 查询所有的角色信息
     */
    @RequestMapping(value = "/", method = RequestMethod.GET)
    public List<Role> findAll() {
        return roleService.findAll();
    }


    /**
     * @return 查询所有的角色信息
     */
    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public Role findById(@PathVariable Long id) {
        return roleService.findById(id);
    }


}
