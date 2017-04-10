package com.cep.controller;

import com.cep.entity.imgText.ImgTextBaseInfo;
import com.cep.entity.imgText.ImgTextClassInfo;
import com.cep.service.ImgTextService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

/**
 * Created by pc on 2017/4/7.
 */
@SpringBootTest(classes = com.cep.Application.class)
@RunWith(SpringJUnit4ClassRunner.class)
@WebAppConfiguration
public class ImgTextControllerTest {
    @Autowired
    ImgTextService imgTextService;
    @Test
    public void testUpdateRandomUserId(){
        List<ImgTextBaseInfo> imgTextList = imgTextService.findImgTextList();
        Map<Integer,Long> randomUserId = new HashMap<>();
        randomUserId.put(0,316l);
        randomUserId.put(1,312l);
        randomUserId.put(2,42l);
        randomUserId.put(3,39l);
        randomUserId.put(4,314l);

        for (ImgTextBaseInfo info:imgTextList) {
            Random random = new Random();
            int p = random.nextInt(5);
            System.out.println(p);
            Long userId = randomUserId.get(p);
            info.setCreateUserId(userId);
            imgTextService.modifyImgText(info);
        }
    }

    /**
     * 将图文id关联到班级
     */
    @Test
    public void testAddImgTextClass(){
        List<ImgTextBaseInfo> imgTextList = imgTextService.findImgTextList();
        for (ImgTextBaseInfo info:imgTextList) {
            ImgTextClassInfo classInfo = new ImgTextClassInfo();
            classInfo.setClassId(1l);
            classInfo.setDel(false);
            classInfo.setImgTextId(info.getId());
            imgTextService.addImgTextClass(classInfo);
        }
    }
    @Test
    public void testAddImgText(){


    }

}