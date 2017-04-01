package com.cep.controller;

import com.cep.entity.imgText.protocol.ImgTextCreateReq;
import com.cep.service.ImgTextService;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by pc on 2017/2/24.
 */
@Controller
@RequestMapping(value = "/imgText")
public class ImgTextController {
    @Autowired
    ImgTextService imgTextService;

    @ApiOperation(value = "创建图文",httpMethod = "POST")
    @ApiImplicitParam(name = "req",value = "图文请求",required = true,dataType = "ImgTextCreateDetailReq")
    @RequestMapping(value = "/publish",method= RequestMethod.POST)
    public String publish(ImgTextCreateReq req) {
        if (false == imgTextService.publish(req, 1)) {
            return "创建失败";
        }
        return "创建成功";
    }


}
