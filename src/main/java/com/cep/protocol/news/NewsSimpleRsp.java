package com.cep.protocol.news;

import java.util.List;
public class NewsSimpleRsp
{
	
	private ViewNewsBaseInfo       base;
	private List<ViewNewsFileInfo> listFile;
	private boolean                isPraise;
	private boolean                isComment;
	private boolean                isFav;
	public ViewNewsBaseInfo getBase() {
		return base;
	}
	public void setBase(ViewNewsBaseInfo base) {
		this.base = base;
	}
	public List<ViewNewsFileInfo> getListFile() {
		return listFile;
	}
	public void setListFile(List<ViewNewsFileInfo> listFile) {
		this.listFile = listFile;
	}
	public boolean isPraise() {
		return isPraise;
	}
	public void setPraise(boolean isPraise) {
		this.isPraise = isPraise;
	}
	public boolean isComment() {
		return isComment;
	}
	public void setComment(boolean isComment) {
		this.isComment = isComment;
	}
	public boolean isFav() {
		return isFav;
	}
	public void setFav(boolean isFav) {
		this.isFav = isFav;
	}
	


	
}