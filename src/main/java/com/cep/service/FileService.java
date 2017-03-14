package com.cep.service;

import org.springframework.web.multipart.MultipartFile;

/**
 * Created by pc on 2017/1/22.
 */
public interface FileService {
   boolean uploadFile(MultipartFile file);

}
