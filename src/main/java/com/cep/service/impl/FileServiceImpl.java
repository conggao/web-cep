package com.cep.service.impl;

import com.cep.dao.file.UploadFileInfoReponsitory;
import com.cep.entity.file.UploadFileInfo;
import com.cep.service.FileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;

/**
 * Created by pc on 2017/1/22.
 */
@Service
public class FileServiceImpl implements FileService {
    @Autowired
    UploadFileInfoReponsitory uploadFileInfoReponsitory;

    @Override
    public boolean uploadFile(MultipartFile file) {
        String filename = file.getOriginalFilename();
        try {
            FileOutputStream fos = new FileOutputStream(file.getOriginalFilename());
            BufferedOutputStream bos = new BufferedOutputStream(fos);
            bos.write(file.getBytes());
            bos.flush();
            bos.close();
        } catch (java.io.IOException e) {
            e.printStackTrace();
            return false;
        }

        UploadFileInfo uploadFileInfo = new UploadFileInfo();

        uploadFileInfo.setName(file.getOriginalFilename());
        if (null == uploadFileInfoReponsitory.save(uploadFileInfo)) {
            return false;
        }
        return true;


    }
}
