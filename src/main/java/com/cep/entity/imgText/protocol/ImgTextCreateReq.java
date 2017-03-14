package com.cep.entity.imgText.protocol;

import java.util.List;

public class ImgTextCreateReq
{
    private String     title;
    private String     content;
    private List<Long> listClassId;
    private List<Long> listFileId;
    private List<Long> listUserId;

    public List<Long> getListUserId()
    {
        return listUserId;
    }

    public void setListUserId(List<Long> listUserId)
    {
        this.listUserId = listUserId;
    }

    public List<Long> getListClassId()
    {
        return listClassId;
    }

    public void setListClassId(List<Long> listClassId)
    {
        this.listClassId = listClassId;
    }

    public String getTitle()
    {
        return title;
    }

    public void setTitle(String title)
    {
        this.title = title;
    }

    public String getContent()
    {
        return content;
    }

    public void setContent(String content)
    {
        this.content = content;
    }

    public List<Long> getListFileId()
    {
        return listFileId;
    }

    public void setListFileId(List<Long> listFileId)
    {
        this.listFileId = listFileId;
    }

}
