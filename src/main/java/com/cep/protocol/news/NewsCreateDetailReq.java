package com.cep.protocol.news;

import java.util.List;


public class NewsCreateDetailReq 
{
	private        String         title;
	private        String         content;
	private        List<Long>     listClassId;
	private        Boolean        isTop;
	private        List<Long>     listFileId;
	
    public Boolean getIsTop() {
		return isTop;
	}

	public void setIsTop(Boolean isTop) {
		this.isTop = isTop;
	}

	public List<Long> getListClassId() {
		return listClassId;
	}

	public void setListClassId(List<Long> listClassId) {
		this.listClassId = listClassId;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public List<Long> getListFileId() {
		return listFileId;
	}

	public void setListFileId(List<Long> listFileId) {
		this.listFileId = listFileId;
	}

}
