package com.cep.controller;

import com.cep.entity.master.UserBaseInfo;
import com.cep.entity.master.UserPasswordInfo;
import com.cep.service.HxService;
import com.cep.service.UserService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import springfox.documentation.annotations.ApiIgnore;

import java.util.List;

/**
 * Created by pc on 2016/12/26.
 */
@Controller
@RequestMapping(value = "/hx")
public class HxController {
    @Autowired
    HxService hxService;
    @Autowired
    UserService userService;

    @ApiIgnore
    @RequestMapping(value = "/addUser/{userName}")
    public void addUser(@PathVariable("userName") String userName) {

    }

    @ApiIgnore
    @RequestMapping(value = "/modifyPassword")
    public void modifyPassword() {
        if (hxService.modifyPassword()) {
            System.out.println("success");
        }
    }

    @ApiIgnore
    @RequestMapping(value = "/modifyPassword/{id}")
    public void modifyPassword(@PathVariable("id") Long id) {
        if (hxService.modifyPassword(id)) {
            System.out.println("success");
        } else {
            System.out.println("fail");
        }
    }

    @ApiIgnore
    @RequestMapping(value = "/delUsers")
    public void delUsers() {
        List<UserBaseInfo> users = userService.getAllUsers();
        for (UserBaseInfo user : users) {
            System.out.println(user.getUserName());
                if (hxService.delUser(user.getUserName())) {
                    System.out.println(user.getRealName() + "success");
                } else {
                    System.out.println("fail");
                }
        }
    }

    @ApiOperation(value = "addUsers", httpMethod = "GET")
    @RequestMapping(value = "/addAllUsers")
    public void addAllUsers() {
        List<UserBaseInfo> users = userService.getAllUsers();
        for (UserBaseInfo user : users) {
            UserPasswordInfo passwordInfo = userService.getPasswordInfo(user.getUserId());
            hxService.addUser(user.getUserName(), passwordInfo.getPassword());
        }


    }

    @ApiIgnore
    @RequestMapping(value = "/delUsersFromFile")
    public void delUsersFromFile() {
        if (hxService.delUserFromFile()) {
            System.out.println("success");
        }
    }
}
