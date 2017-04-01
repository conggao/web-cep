package com.cep.entity.login;

import com.alibaba.fastjson.JSON;
import org.junit.Test;

import java.lang.reflect.Method;

import static org.junit.Assert.*;

/**
 * Created by pc on 2017/4/1.
 */
public class AddChildReqInfoTest {
    @Test
    public void addChildReqDemo(){
        AddChildReqInfo info = new AddChildReqInfo();
        RegChildrenInfo childrenInfo = new RegChildrenInfo();
     /*   childrenInfo.setAddrCityId();
        childrenInfo.setBirthday(19930709);
        childrenInfo.setHeadPicId(143818L);
        childrenInfo.setInviteCode();
        childrenInfo.setSex();
        childrenInfo.setStudentId();*/
        for (Method method : RegChildrenInfo.class.getMethods()) {
            String methodName = method.getName();
           if (methodName.matches("^set.*?$"))
            System.out.println("childrenInfo."+methodName+"();");
        }
        childrenInfo.setAddrCityId(440305);
        childrenInfo.setRealName("轩仔");
        childrenInfo.setHeadPicId(143818L);
        childrenInfo.setInviteCode("958216");
        childrenInfo.setStudentId(2017L);
        childrenInfo.setUserName("轩仔");
        childrenInfo.setBirthday(19930709);
        childrenInfo.setSex(true);
        //反射得到setter
        for (Method method : AddChildReqInfo.class.getMethods()) {
            String methodName = method.getName();
            if (methodName.matches("^set.*?$"))
                System.out.println("info."+methodName+"();");
        }
        info.setFamilyId(44L);
        info.setParentId(40L);
        info.setMobilePhone("19999799985");
        info.setRegChildrenInfo(childrenInfo);
        System.out.println(JSON.toJSONString(info));


    }

}