package com.cep.service.impl;

import com.cep.dao.file.UploadFileInfoReponsitory;
import com.cep.entity.file.UploadFileInfo;
import com.cep.service.DbService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by pc on 2017/1/12.
 */
@Service
public class DbServiceImpl implements DbService {
    private UploadFileInfoReponsitory fileInfoReponsitory;

    public UploadFileInfoReponsitory getFileInfoReponsitory() {
        return fileInfoReponsitory;
    }

    @Autowired

    public void setFileInfoReponsitory(UploadFileInfoReponsitory fileInfoReponsitory) {
        this.fileInfoReponsitory = fileInfoReponsitory;
    }

    @Override
    public boolean modifyFileName() {
        String name = "%null(%).%";
        List<UploadFileInfo> fileInfoList = fileInfoReponsitory.findByNameLike(name);
        if (null==fileInfoList||0==fileInfoList.size()) {
            return false;
        }
        for (UploadFileInfo info : fileInfoList) {

            String newName = getNameByRegex(info.getName());
            System.out.println(newName);
            info.setName(newName);
            fileInfoReponsitory.save(info);
        }
        fileInfoReponsitory.flush();
        return true;
    }

    public String getNameByRegex(String name) {
        String pattern = "(?<delString>null\\(.*\\)\\.)(?<fileName>.*)";
        Pattern p = Pattern.compile(pattern);
        Matcher m = p.matcher(name);
        if (m.find()) {
            return m.group("fileName");
        }
        return null;
    }
}
