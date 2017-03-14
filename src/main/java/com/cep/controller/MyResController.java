package com.cep.controller;

import com.cep.service.FileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by pc on 2017/1/22.
 */
@Controller
@RequestMapping(value = "/MyRes")
public class MyResController {
    @Autowired
    private FileService fileService;
}
