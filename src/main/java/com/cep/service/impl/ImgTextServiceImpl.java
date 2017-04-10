package com.cep.service.impl;

import com.cep.dao.imgText.ImgTextClassRepository;
import com.cep.dao.imgText.ImgTextFileRepository;
import com.cep.dao.imgText.ImgTextRepository;
import com.cep.entity.imgText.ImgTextBaseInfo;
import com.cep.entity.imgText.ImgTextClassInfo;
import com.cep.entity.imgText.ImgTextFileInfo;
import com.cep.entity.imgText.protocol.ImgTextCreateReq;
import com.cep.entity.imgText.protocol.ImgTextDetailRsp;
import com.cep.entity.imgText.protocol.ImgTextSimpleRsp;
import com.cep.entity.imgText.view.ViewImgTextBaseInfo;
import com.cep.service.ImgTextService;
import com.cep.utils.BasicUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by conggao on 2017/2/23.
 */
@Service
public class ImgTextServiceImpl implements ImgTextService {
    @Autowired
    private ImgTextRepository imgTextRepository;
    @Autowired
    private ImgTextFileRepository imgTextFileRepository;
    @Autowired
    private ImgTextClassRepository imgTextClassRepository;

    @Override
    public boolean addImgText(ImgTextBaseInfo imgTextBaseInfo) {
        ImgTextBaseInfo info = imgTextRepository.save(imgTextBaseInfo);
        if (null != info) {
            return true;
        }
        return false;
    }

    @Override
    public boolean addImgTextClass(ImgTextClassInfo info) {
        imgTextClassRepository.save(info);
        return true;
    }


    @Override
    public List<ViewImgTextBaseInfo> findViewImgTextList() {
        List<ViewImgTextBaseInfo> listImgText = imgTextRepository.findListImgTextBaseInfo();
        return listImgText;
    }

    @Override
    public List<ImgTextBaseInfo> findImgTextList() {
        List<ImgTextBaseInfo> listImgText = imgTextRepository.findAll();
        return listImgText;
    }

    @Override
    public boolean modifyImgText(ImgTextBaseInfo info) {
        ImgTextBaseInfo imgTextBaseInfo = imgTextRepository.save(info);
        if (imgTextBaseInfo == null) {
            return false;
        } else {
            return true;
        }

    }

    /**
     * 发布图文
     *
     * @param req
     * @return
     */
    @Override
    public boolean publish(ImgTextCreateReq req, int type) {
        ImgTextBaseInfo imgTextBaseInfo = new ImgTextBaseInfo();
        imgTextBaseInfo.setType(type);
        setPublish(req, imgTextBaseInfo);
        if (null == imgTextRepository.save(imgTextBaseInfo)) {
            return false;
        }

        if (false == setFileList(req, imgTextBaseInfo.getId())) {
            return false;
        }
        return true;
    }

    @Override
    public List<ImgTextSimpleRsp> loadMore() {
        List<ImgTextSimpleRsp> rspList = new ArrayList<>();

        return null;
    }

    @Override
    public List<ImgTextSimpleRsp> refresh() {
        return null;
    }

    /**
     * 获取详情
     *
     * @return
     */
    @Override
    public ImgTextDetailRsp getDetail() {
        return null;
    }

    /**
     * 为图文绑定附件列表
     *
     * @param reqValue
     * @param imgTextId
     * @return
     */
    private boolean setFileList(ImgTextCreateReq reqValue, Long imgTextId) {
        List<Long> listFileId = reqValue.getListFileId();
        if (listFileId != null && listFileId.size() > 0) {
            List<ImgTextFileInfo> listImgTextFileInfo = new ArrayList<ImgTextFileInfo>();
            for (Long fileId : listFileId) {
                ImgTextFileInfo imgTextFileInfo = new ImgTextFileInfo();
                imgTextFileInfo.setFileId(fileId);
                imgTextFileInfo.setImgTextId(imgTextId);
                listImgTextFileInfo.add(imgTextFileInfo);
            }
            if (null == imgTextFileRepository.save(listImgTextFileInfo)) {
                return false;
            }
        }
        return true;
    }

    /**
     * 为图文绑定基本属性
     *
     * @param reqValue
     * @param imgTextBaseInfo
     * @return
     */
    private ImgTextBaseInfo setPublish(ImgTextCreateReq reqValue, ImgTextBaseInfo imgTextBaseInfo) {
        imgTextBaseInfo.setTitle(reqValue.getTitle());
        imgTextBaseInfo.setContent(reqValue.getContent());
        imgTextBaseInfo.setCreateTime(BasicUtils.getCurrentTime());
        imgTextBaseInfo.setLastUpdateTime(imgTextBaseInfo.getCreateTime());
        imgTextBaseInfo.setPraiseNum(0);
        imgTextBaseInfo.setCommentNum(0);
        imgTextBaseInfo.setDel(false);
        return imgTextBaseInfo;
    }

}
