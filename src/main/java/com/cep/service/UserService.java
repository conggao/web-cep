package com.cep.service;

import com.cep.entity.master.UserBaseInfo;
import com.cep.entity.master.UserPasswordInfo;
import com.cep.entity.self.protocol.SelfInfoRsp;

import java.util.List;


public interface UserService {
    List<UserBaseInfo> getAllUsers();
    String getToken(Long userId);
    UserPasswordInfo getPasswordInfo(Long userId);
    SelfInfoRsp getSelfInfoRsp(Long userId);

}