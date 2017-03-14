package com.cep.entity.imgText.protocol;

import com.cep.entity.imgText.view.ViewImgTextCommentInfo;
import com.cep.entity.imgText.view.ViewImgTextPraiseInfo;

import java.util.List;


public class ImgTextDetailRsp
{

	private ImgTextSimpleRsp             imgTextSimpleRsp;
	private List<ViewImgTextCommentInfo> listCommnet;
	private List<ViewImgTextPraiseInfo>  listPraise;
	
	
	public ImgTextSimpleRsp getImgTextSimpleRsp() {
		return imgTextSimpleRsp;
	}
	public void setImgTextSimpleRsp(ImgTextSimpleRsp imgTextSimpleRsp) {
		this.imgTextSimpleRsp = imgTextSimpleRsp;
	}
	public List<ViewImgTextCommentInfo> getListCommnet() {
		return listCommnet;
	}
	public void setListCommnet(List<ViewImgTextCommentInfo> listCommnet) {
		this.listCommnet = listCommnet;
	}
	public List<ViewImgTextPraiseInfo> getListPraise() {
		return listPraise;
	}
	public void setListPraise(List<ViewImgTextPraiseInfo> listPraise) {
		this.listPraise = listPraise;
	}
	

}