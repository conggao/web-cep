package com.cep.entity;

import com.cep.entity.user.ClassBaseInfo;
import com.cep.utils.MapReduceUtil;
import org.junit.Before;
import org.junit.Test;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

/**
 * Created by pc on 2017/4/7.
 */
public class ClassBaseInfoTest {
    ClassBaseInfo classBaseInfo;

    @Before
    public void before() {
        classBaseInfo = new ClassBaseInfo();
    }

    @Test
    //获取实体的属性生成带逗号的集合
    public void testToDoc() {
        List<String> fieldNames = new ArrayList<>();
        for (Field field : classBaseInfo.getClass().getDeclaredFields()) {

            fieldNames.add(field.getName());
        }
        System.out.println(MapReduceUtil.reduceWithComma(fieldNames));

    }

}