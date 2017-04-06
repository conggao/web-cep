package com.cep.entity.login;

import com.alibaba.fastjson.JSON;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by pc on 2017/4/6.
 */
public class SmsCodeReqInfoTest {
    SmsCodeReqInfo smsCodeReqInfo;

    @Before
    public void setUp() throws Exception {
        smsCodeReqInfo = new SmsCodeReqInfo();
    }
    @Test
    public void testReq(){
        smsCodeReqInfo.setMobilePhone("13049804861");
        System.out.println(JSON.toJSONString(smsCodeReqInfo));
    }

}