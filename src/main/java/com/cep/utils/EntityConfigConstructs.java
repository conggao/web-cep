package com.cep.utils;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by pc on 2017/3/2.
 */
//生成映射实体的配置
public class EntityConfigConstructs {
    public List<String> getFileName() {
        File[] files = new File("D:\\MyIJ\\web_cep\\src\\main\\java\\com\\cep\\entity\\imgText\\view").listFiles();
        List<String> fileNames = new ArrayList<>();
        for (File file : files) {
            if (file.isFile()) {
                fileNames.add(file.getName().substring(0,file.getName().lastIndexOf(".")));
            }
        }

        return fileNames;

    }

}
