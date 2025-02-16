package com.pmsback.controller;

import com.pmsback.entity.SysUser;
import com.pmsback.service.SysUserService;
import com.pmsback.vo.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


/**
 * Test Controller
 */
@RestController
@RequestMapping("/test")
public class TestController {

    @Autowired
    private SysUserService sysUserService;

    @RequestMapping("/user/list")
    public Result userList() {
        List<SysUser> sysUsers = sysUserService.list();
        return Result.success(sysUsers);
    }

}
