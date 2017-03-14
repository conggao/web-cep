package com.cep.dao.imgText;

import com.cep.entity.imgText.view.ViewImgTextBaseInfo;

import java.util.List;

/**
 * Created by pc on 2017/2/23.
 */
public interface ImgTextViewRepository {
    List<ViewImgTextBaseInfo> findListImgTextBaseInfo();
    List<ViewImgTextBaseInfo> LoadMore(Long classId, String timeStart, Integer count);
    List<ViewImgTextBaseInfo> update(Long classId, String timeStart, String timeLastUpdate);



}
