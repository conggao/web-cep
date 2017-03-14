package com.cep.controller;

import com.cep.service.UserService;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/**
 * Created by pc on 2016/11/15.
 */
@Controller
@RequestMapping("/user")
public class UserController {

    private UserService userService;

    public UserService getUserService() {
        return userService;
    }

    @Autowired
    public void setUserService(UserService userService) {
        this.userService = userService;
    }

    @ApiOperation(value = "获取登录的token",httpMethod = "GET")
    @ApiImplicitParam(value = "用户的id",name = "userId",required = true,dataType = "Long")
    @RequestMapping(value = "/getToken/{userId}")
    @ResponseBody
    public String getUserToken(@PathVariable("userId") Long userId) {
        String token = userService.getToken(userId);
        return token;

    }
}
