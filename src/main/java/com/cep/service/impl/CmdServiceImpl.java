package com.cep.service.impl;

import com.cep.dao.file.DirRepository;
import com.cep.dao.master.UserBaseInfoRepository;
import com.cep.entity.file.DirInfo;
import com.cep.entity.master.UserBaseInfo;
import com.cep.service.CmdService;
import com.cep.utils.BasicUtils;
import org.springframework.stereotype.Service;

/**
 * Created by pc on 2016/12/28.
 */
@Service
public class CmdServiceImpl implements CmdService {
    private UserBaseInfoRepository userBaseInfoRepository;
    private DirRepository dirRepository;

    public UserBaseInfoRepository getUserBaseInfoRepository() {
        return userBaseInfoRepository;
    }

    public void setUserBaseInfoRepository(UserBaseInfoRepository userBaseInfoRepository) {
        this.userBaseInfoRepository = userBaseInfoRepository;
    }

    public DirRepository getDirRepository() {
        return dirRepository;
    }

    public void setDirRepository(DirRepository dirRepository) {
        this.dirRepository = dirRepository;
    }

    public boolean AddMyResRoots() {
        for (UserBaseInfo info : userBaseInfoRepository.findAll()) {
            if (null == dirRepository.findByParentIdAndCreateUserId(null, info.getUserId())) {
                DirInfo dirInfo = new DirInfo();
                dirInfo.setCreateTime(BasicUtils.getCurrentTime());
                dirInfo.setName("root");
                dirInfo.setShare(false);
                dirInfo.setDel(false);
                dirInfo.setCreateUserId(info.getUserId());
                if (null != dirRepository.saveAndFlush(dirInfo)) {
                    System.out.println("ok:" + "        " + info.getUserId() + "         " + info.getUserName());
                } else {
                    System.out.println("fail:" + "      " + info.getUserName());
                    return false;
                }
            }
        }
        return true;


    }
}
