package com.cep.controller;

import com.cep.service.FileService;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;

/**
 * Created by pc on 2017/2/24.
 */

@Controller
@RequestMapping(value = "/file")
public class FileController {
    @Autowired
    FileService fileService;

    @ApiOperation(value = "上传文件", notes = "客户端传来文件保存到服务器，并记录到数据库",httpMethod = "POST")
    @ApiImplicitParam(name = "file", value = "上传的文件", required = true, dataType = "MultipartFile",allowMultiple = true)
    @RequestMapping(value = "/upload",method = RequestMethod.POST)
    public String upload(@RequestParam("file") MultipartFile file) {
        if (!fileService.uploadFile(file)) {
            return "fail";
        }
        return "success";
    }
}
