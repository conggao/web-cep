package com.cep.controller;
import io.swagger.annotations.ApiOperation;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by pc on 2016/11/17.
 */
@Controller
public class RegistUsersController {
    @ApiOperation(value = "index",httpMethod = "GET")
    @RequestMapping(value = "/regist")
    public String regist(){
        return "success";
    }

}
