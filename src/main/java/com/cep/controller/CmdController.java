package com.cep.controller;

import com.cep.service.CmdService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import springfox.documentation.annotations.ApiIgnore;

/**
 * Created by pc on 2016/12/28.
 */
@Controller
@RequestMapping(value = "/cmd")
public class CmdController {
    CmdService cmdService;

    public CmdService getCmdService() {
        return cmdService;
    }

    @Autowired
    public void setCmdService(CmdService cmdService) {
        this.cmdService = cmdService;
    }

    @ApiIgnore
    @RequestMapping(value = "/addRoots")
    public void addRoots() {
        if (cmdService.AddMyResRoots()) {
            System.out.println("add success");
        }else {
            System.out.println("add fail");
        }

    }

}
