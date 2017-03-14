package com.cep.controller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by pc on 2016/11/17.
 */
@Controller
@RequestMapping(value = "regist")
public class RegistUsersController {
    public String regist(){
        return "success";
    }

}
