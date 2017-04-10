package com.cep.utils;

import com.alibaba.fastjson.JSON;
/*import com.google.gson.Gson;
import com.google.gson.GsonBuilder;*/

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * Created by pc on 2017/4/10.
 */
public class JsonUtil {
    public static String toJson(Class clazz) {
        Object o = null;
        try {
            o = clazz.newInstance();
            for (Method method : clazz.getMethods()) {
                String methodName = method.getName();
                if (methodName.matches("^set.*?$")) {
                    Class<?>[] types = method.getParameterTypes();
                    Class<?> type = types[0];
                    Object defaultValue = getDefaultValue(type);
                    method.invoke(o,defaultValue);
                }
            }
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
        return "";
   /*     GsonBuilder builder = new GsonBuilder();
        Gson creater = builder.setPrettyPrinting().create();
        Gson creater1 = builder.serializeNulls().create();
        return creater1.toJson(o);*/
    }

    private static Object getDefaultValue(Class clazz) {
        String className = clazz.getName();
        if (className.equals("java.lang.Integer")) {
            return 0;
        }
        if (className.equals("boolean")) {
            return false;
        }
        if (className.equals("java.lang.Long")) {
            return 0l;
        }
        if (className.equals("java.lang.String")) {
            return "";
        }
        if (className.equals("java.util.List")) {
            return null;
        }
        return null;
    }
}
