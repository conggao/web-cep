package com.cep.service;

import com.cep.entity.imgText.ImgTextBaseInfo;
import com.cep.entity.imgText.ImgTextClassInfo;
import com.cep.entity.imgText.protocol.ImgTextCreateReq;
import com.cep.entity.imgText.protocol.ImgTextDetailRsp;
import com.cep.entity.imgText.protocol.ImgTextSimpleRsp;
import com.cep.entity.imgText.view.ViewImgTextBaseInfo;

import java.util.List;

/**
 * Created by pc on 2017/2/23.
 */
public interface ImgTextService {
    boolean addImgText(ImgTextBaseInfo activityBaseInfo);

    boolean addImgTextClass(ImgTextClassInfo info);

    List<ViewImgTextBaseInfo> findViewImgTextList();

    List<ImgTextBaseInfo> findImgTextList();

    boolean modifyImgText(ImgTextBaseInfo info);

    boolean publish(ImgTextCreateReq req, int type);

    List<ImgTextSimpleRsp> loadMore();

    List<ImgTextSimpleRsp> refresh();


    ImgTextDetailRsp getDetail();
}
