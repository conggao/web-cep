package com.cep.entity.login;

import com.alibaba.fastjson.JSON;
import com.cep.utils.ClassUtil;
import org.junit.Before;
import org.junit.Test;
import springfox.documentation.spring.web.json.JsonSerializer;

import static org.junit.Assert.*;

/**
 * Created by pc on 2017/4/6.
 */
public class RegReqInfoTest {
    RegReqInfo info;
    ClassUtil util;
    @Before
    public void before(){
        info = new RegReqInfo();
        util = new ClassUtil();
    }
    @Test
    public void testRegReqInfo(){
        String infoSetter = util.getClassSetter(RegReqInfo.class, "info");
        System.out.println(infoSetter);
        RegChildrenInfo childrenInfo = new RegChildrenInfo();
        childrenInfo.setAddrCityId(440305);
        childrenInfo.setRealName("轩仔");
        childrenInfo.setHeadPicId(143818L);
        childrenInfo.setInviteCode("958216");
        childrenInfo.setStudentId(2017L);
        childrenInfo.setUserName("轩仔");
        childrenInfo.setBirthday(19930709);
        childrenInfo.setSex(true);
        info.setRegChildrenInfo(childrenInfo);
        info.setPassword("123321");
        info.setSex(false);
        info.setMobilePhone("13049814861");
        info.setRealName("congge");
        info.setRole(3);
        info.setSmsVerificationCode("545");
        System.out.println(JSON.toJSONString(info));
    }

}