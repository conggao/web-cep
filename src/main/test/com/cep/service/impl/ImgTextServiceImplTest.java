package com.cep.service.impl;

import com.alibaba.fastjson.JSON;
import com.cep.Application;
import com.cep.entity.imgText.ImgTextBaseInfo;
import com.cep.service.ImgTextService;
import com.cep.utils.BasicUtils;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * DbServiceImpl Tester.
 *
 * @author <Authors name>
 * @version 1.0
 * @since <pre>一月 12, 2017</pre>
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = Application.class)
public class ImgTextServiceImplTest {
    @Autowired
    private ImgTextService imgTextService;

    @Before
    public void before() throws Exception {
    }

    @After
    public void after() throws Exception {
    }

    /**
     * 发布活动
     */
    @Test
    public void addImgText(){
        ImgTextBaseInfo imgTextBaseInfo = new ImgTextBaseInfo();
        imgTextBaseInfo.setTitle("活动的标题");
        imgTextBaseInfo.setContent("活动的内容");
        imgTextBaseInfo.setClassId(1l);
        imgTextBaseInfo.setComment(false);
        imgTextBaseInfo.setCommentNum(0);
        imgTextBaseInfo.setPraiseNum(0);
        imgTextBaseInfo.setType(1);
        imgTextBaseInfo.setLastUpdateTime(BasicUtils.getCurrentTime());
        imgTextBaseInfo.setCreateTime(BasicUtils.getCurrentTime());
        imgTextBaseInfo.setDel(false);
        if (imgTextService.addImgText(imgTextBaseInfo)) {
            System.out.println(JSON.toJSONString(imgTextBaseInfo));
        }else{
            System.out.println("fail");
        }
    }
    /**
     * 查询活动列表
     */

}

