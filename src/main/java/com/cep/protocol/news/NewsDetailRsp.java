package com.cep.protocol.news;

import java.util.List;
public class NewsDetailRsp
{

	private NewsSimpleRsp             newsSimpleRsp;
	private List<ViewNewsCommnetInfo> listCommnet;
	private List<ViewNewsPraiseInfo>  listPraise;
	
	
	public NewsSimpleRsp getNewsSimpleRsp() {
		return newsSimpleRsp;
	}
	public void setNewsSimpleRsp(NewsSimpleRsp newsSimpleRsp) {
		this.newsSimpleRsp = newsSimpleRsp;
	}
	public List<ViewNewsCommnetInfo> getListCommnet() {
		return listCommnet;
	}
	public void setListCommnet(List<ViewNewsCommnetInfo> listCommnet) {
		this.listCommnet = listCommnet;
	}
	public List<ViewNewsPraiseInfo> getListPraise() {
		return listPraise;
	}
	public void setListPraise(List<ViewNewsPraiseInfo> listPraise) {
		this.listPraise = listPraise;
	}
	

}