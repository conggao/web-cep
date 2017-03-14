package com.cep.protocol.news;

import java.util.List;


public class NewsListRsp 
{
	
	private List<NewsSimpleRsp>    list;
	private String                 updateTime;
	
	public List<NewsSimpleRsp> getList() {
		return list;
	}
	public void setList(List<NewsSimpleRsp> list) {
		this.list = list;
	}
	public String getUpdateTime() {
		return updateTime;
	}
	public void setUpdateTime(String updateTime) {
		this.updateTime = updateTime;
	}
	

	
}