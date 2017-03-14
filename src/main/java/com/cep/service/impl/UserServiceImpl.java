package com.cep.service.impl;

import com.cep.dao.master.PasswordReponsitory;
import com.cep.dao.master.UserBaseInfoRepository;
import com.cep.dao.master.UserTokenRepository;
import com.cep.entity.master.IoBaseInfo;
import com.cep.entity.master.UserBaseInfo;
import com.cep.entity.master.UserPasswordInfo;
import com.cep.entity.self.protocol.SelfInfoRsp;
import com.cep.entity.user.FoodBaseInfo;
import com.cep.entity.user.HealthBaseInfo;
import com.cep.service.UserService;
import com.cep.utils.BasicUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by pc on 2017/1/20.
 */
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserBaseInfoRepository userBaseInfoRepository;
    @Autowired
    private UserTokenRepository userTokenRepository;
    @Autowired
    private PasswordReponsitory passwordReponsitory;


    @Override
    public List<UserBaseInfo> getAllUsers() {
        List<UserBaseInfo> userBaseInfoList = userBaseInfoRepository.findAll();
        return userBaseInfoList;
    }

    @Override
    public String getToken(Long userId) {
        String token = userTokenRepository.getOne(userId).getToken();
        return token;
    }

    @Override
    public UserPasswordInfo getPasswordInfo(Long userId) {
        return passwordReponsitory.getOne(userId);
    }

    @Override
    public SelfInfoRsp getSelfInfoRsp(Long userId) {
/*
        HealthBaseInfo healthBaseInfo = this.getMainAction().getMasterService().queryHealthBaseInfo(userId, BasicUtils.getCurrentDateString());
        List<IoBaseInfo> listIoBaseInfo = this.getMainAction().getMasterService().queryListIoBaseInfo(userId);
        List<FoodBaseInfo> listFoodBaseInfo = this.getMainAction().getMasterService().queryListFoodBaseInfo(this.getListClassId(userId).get(0));
        if (healthBaseInfo != null && listIoBaseInfo != null && listFoodBaseInfo != null)
        {
            SelfInfoRsp rsp = new SelfInfoRsp();
            rsp.setTemperature(healthBaseInfo.getTemperature());
            for (FoodBaseInfo foodBaseInfo : listFoodBaseInfo)
            {
                if (1 == foodBaseInfo.getType())
                {
                    rsp.setBreakFirst(foodBaseInfo.getFood());
                }
                else if (2 == foodBaseInfo.getType())
                {
                    rsp.setLunch(foodBaseInfo.getFood());

                }
            }
            for (IoBaseInfo ioBaseInfo : listIoBaseInfo)
            {
                if (ioBaseInfo.getType())
                {
                    rsp.setIn(ioBaseInfo.getIoTime());
                }
                else
                {
                    rsp.setOut(ioBaseInfo.getIoTime());
                }
            }
            return rsp;
        }
        return rsp;*/
        return null;
    }
}
