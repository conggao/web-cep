package com.cep.utils;

import com.cep.entity.login.RegChildrenInfo;
import com.cep.entity.login.RegReqInfo;

import java.lang.reflect.Method;

/**
 * Created by pc on 2017/4/6.
 */

/**
 * 初始化对象，生成setter
 */
public class ClassUtil {
    public static String getClassSetter(Class infoClass, String objName) {
        StringBuffer sb = new StringBuffer();
        for (Method method : infoClass.getMethods()) {
            String methodName = method.getName();
            if (methodName.matches("^set.*?$")) {
                sb.append(objName + "." + methodName + "();");
                sb.append("\n");
            }
        }
        return sb.toString();
    }
}
