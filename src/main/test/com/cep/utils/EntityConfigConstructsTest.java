package com.cep.utils;

import org.junit.Before;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

/**
 * Created by pc on 2017/3/2.
 */
public class EntityConfigConstructsTest {
    private EntityConfigConstructs entityConfigConstructs;
    @Before
    public void before(){
        entityConfigConstructs = new EntityConfigConstructs();
    }
    @Test
    public void getFileName() throws Exception {
        List<String> fileNames = entityConfigConstructs.getFileName();
        for (String fileName : fileNames) {
            System.out.println("<value>com/entity/imgText/" + fileName+".hbm.xml</value>");
        }

    }

}