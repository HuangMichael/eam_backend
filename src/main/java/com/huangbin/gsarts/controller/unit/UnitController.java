package com.huangbin.gsarts.controller.unit;


import com.huangbin.gsarts.controller.base.BaseController;
import com.huangbin.gsarts.model.unit.Unit;
import com.huangbin.gsarts.model.user.User;
import com.huangbin.gsarts.service.unit.UnitService;
import com.huangbin.gsarts.service.user.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * 用户控制器
 */
@RestController
@RequestMapping(value = "/unit")
public class UnitController extends BaseController {

    @Autowired
    UnitService unitService;
    /**
     * @return 查询所有的用户信息
     */
    @RequestMapping(value = "/", method = RequestMethod.GET)
    public List<Unit> findAll() {
        return unitService.findAll();
    }


    /**
     * @return 查询所有的用户信息
     */
    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public Unit findById(@PathVariable Long id) {
        return unitService.findById(id);
    }


}
