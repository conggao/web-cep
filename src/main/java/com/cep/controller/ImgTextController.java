package com.cep.controller;

import com.cep.entity.imgText.ImgTextBaseInfo;
import com.cep.entity.imgText.protocol.ImgTextCreateReq;
import com.cep.service.ImgTextService;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import springfox.documentation.annotations.ApiIgnore;

import java.util.*;

/**
 * Created by pc on 2017/2/24.
 */
@Controller
@RequestMapping(value = "/imgText")
public class ImgTextController {
    @Autowired
    ImgTextService imgTextService;

    //@ApiOperation(value = "创建图文",httpMethod = "POST")
    @ApiOperation(value = "createImgText", httpMethod = "POST")
    @ApiImplicitParam(name = "req", value = "imgTextReq", required = true, dataType = "ImgTextCreateDetailReq")
    @RequestMapping(value = "/publish", method = RequestMethod.POST)
    @ApiIgnore
    public String publish(ImgTextCreateReq req) {
        if (false == imgTextService.publish(req, 1)) {
            return "创建失败";
        }
        return "创建成功";
    }

    @ApiIgnore
    public String CreateRandomImgText() {
        return null;
    }

    @ApiIgnore
    public String UpdateRandomUserId() {

        List<ImgTextBaseInfo> imgTextList = imgTextService.findImgTextList();
        Map<Integer, Long> randomUserId = new HashMap<>();
        randomUserId.put(0, 316l);
        randomUserId.put(1, 312l);
        randomUserId.put(2, 42l);
        randomUserId.put(3, 39l);
        for (ImgTextBaseInfo info : imgTextList) {
            Random random = new Random();
            int p = random.nextInt();
            System.out.println(p);
            //info.setCreateUserId(randomUserId.get(randomUserId.get(p)));
        }
        return null;
    }


}
