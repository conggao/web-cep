package com.cep.service.impl;


import com.alibaba.fastjson.JSON;
import com.cep.dao.master.PasswordReponsitory;
import com.cep.dao.master.UserBaseInfoRepository;
import com.cep.entity.huanxin.Token;
import com.cep.entity.master.UserBaseInfo;
import com.cep.service.HxService;
import com.cep.utils.HttpRequestUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.*;
import java.util.List;

@Service
public class HxServiceImpl implements HxService {
    @Autowired
    private UserBaseInfoRepository userBaseInfoRepository;
    @Autowired
    private PasswordReponsitory passwordReponsitory;

    private String queryToken() {
        String token = HttpRequestUtil.sendPost("https://a1.easemob.com/1185161008178776/youngchildrentest/token",
                " {\"grant_type\":\"client_credentials\",\"client_id\":\"YXA6FGzicO6qEead87d0xb_Vbw\",\"client_secret\":\"YXA6sL4TvFQ0S-UbDaooffuIJhF982A\"}");
        System.out.println(token);
        Token tokenObj = JSON.parseObject(token, Token.class);
        return tokenObj.getAccess_token();
    }

    @Override
    public boolean addUserFromFile() {
        File file = new File("D:\\users\\huanxinUsers.txt");
        FileReader fileReader = null;
        try {
            fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String name = null;
            while ((name = bufferedReader.readLine()) != null) {
                if (HttpRequestUtil.sendPost("https://a1.easemob.com/1185161008178776/youngchildrentest/users",
                        "{\"username\":\"" +
                                name +
                                "\",\"password\":\"" +
                                "1" +
                                "\"}", queryToken())) {

                }
            }
            return true;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return false;
    }

    @Override
    public boolean delAllUsers() {
        return true;
    }

    @Override
    public boolean delUser(String userName) {
        String url = "https://a1.easemob.com/1185161008178776/youngchildrentest/users/" + userName;
        System.out.println(url);
        if (HttpRequestUtil.sendByDelete(url, null, queryToken())) {
            System.out.println("success");
            return true;
        } else {
            System.out.println("fail");
            return false;
        }
    }


    @Override
    public boolean modifyPassword() {
        for (UserBaseInfo info : userBaseInfoRepository.findAll()) {
            modifyPass(info.getUserName(), passwordReponsitory.getOne(info.getUserId()).getPassword());
        }
        return true;
    }

    @Override
    public boolean modifyPassword(Long id) {
        UserBaseInfo info = userBaseInfoRepository.findOne(id);
        if (modifyPass(info.getUserName(), passwordReponsitory.getOne(id).getPassword())) {
            System.out.println("修改成功");
            return true;
        } else {
            System.out.println("fail");
            return false;
        }


    }

    @Override
    public boolean delUserFromFile() {
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader("D:\\MyIJ\\web_fsc\\src\\main\\resources\\delInfo.txt"));
            String userName = bufferedReader.readLine();
            while (userName != null) {
                if (delUser(userName)) {
                    System.out.println(userName + "success");
                } else {
                    System.out.println(userName + "fail");
                }
                userName = bufferedReader.readLine();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return true;
    }


    public Boolean modifyPass(String name, String pwd) {
        String reqPass = "{\"newpassword\":\"" + pwd + "\"}";
        String urlPass = "https://a1.easemob.com/1185161008178776/youngchildrentest/users/" + name + "/password";
        if (HttpRequestUtil.sendByPut(urlPass, reqPass, queryToken())) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public boolean addUser(String name, String password) {
        HttpRequestUtil.sendGet("https://a1.easemob.com/1185161008178776/youngchildrentest/users/" + name, null, queryToken());
        if (HttpRequestUtil.sendPost("https://a1.easemob.com/1185161008178776/youngchildrentest/users",
                "{\"username\":\"" +
                        name +
                        "\",\"password\":\"" +
                        password +
                        "\"}", queryToken())) {
            return true;
        }
        return false;
    }

    @Override
    public boolean addAllUsersFromDb() {
        List<UserBaseInfo> userBaseInfos = userBaseInfoRepository.findAll();
        for (UserBaseInfo info : userBaseInfos) {
            if (addUser(info.getUserName(), passwordReponsitory.findOne(info.getUserId()).getPassword())) {
            } else {
                return false;
            }
        }
        return true;
    }


}

