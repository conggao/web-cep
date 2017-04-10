package com.cep.entity.imgText.protocol;

import com.alibaba.fastjson.JSON;
import com.cep.utils.ClassUtil;
import com.cep.utils.JsonUtil;
import com.cep.utils.MapReduceUtil;
/*import com.google.gson.Gson;
import com.google.gson.GsonBuilder;*/
import org.junit.Test;
import springfox.documentation.spring.web.json.Json;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

/**
 * Created by pc on 2017/4/10.
 */
public class ImgTextCreateReqTest {
    @Test
    public void showCreateReq(){
        ImgTextCreateReq req = new ImgTextCreateReq();
    /*    List<String> listField = new ArrayList<>();
        for (Field field : ImgTextCreateReq.class.getDeclaredFields()) {
            listField.add(field.getName());
        }
        System.out.println(MapReduceUtil.reduceWithComma(listField));
        System.out.println(ClassUtil.getClassSetter(ImgTextCreateReq.class,"imgTextCreateReq"));
        Gson gson = new Gson();

        System.out.println(gson.toJsonTree(req));
        GsonBuilder builder = new GsonBuilder();
        Gson create = builder.setPrettyPrinting().create();
        System.out.println(create.toJson(req));*/
        System.out.println(JsonUtil.toJson(ImgTextCreateReq.class));
    }

}