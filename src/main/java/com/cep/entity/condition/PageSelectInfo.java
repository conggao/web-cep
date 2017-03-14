package com.cep.entity.condition;

/**
 * ArticleInfo entity. @author MyEclipse Persistence Tools
 */

public class PageSelectInfo implements java.io.Serializable {

	private Integer totalNumber;
	private Integer pageNum;
	private Integer offset;
	private Integer length;
	private boolean hasPrePage;
	private boolean hasNextPage;
	// Constructors

	/** default constructor */
	public PageSelectInfo() {
	}

	
	
	public Integer getTotalNumber() {
		return totalNumber;
	}

	public void setTotalNumber(Integer totalNumber) {
		this.totalNumber = totalNumber;
	}

	public Integer getPageNum() {
		return pageNum;
	}

	public void setPageNum(Integer pageNum) {
		this.pageNum = pageNum;
	}




	public Integer getOffset() {
		return offset;
	}

	public void setOffset(Integer offset) {
		this.offset = offset;
	}

	public Integer getLength() {
		return length;
	}

	public void setLength(Integer length) {
		this.length = length;
	}

	public boolean isHasPrePage() {
		return hasPrePage;
	}

	public void setHasPrePage(boolean hasPrePage) {
		this.hasPrePage = hasPrePage;
	}

	public boolean isHasNextPage() {
		return hasNextPage;
	}

	public void setHasNextPage(boolean hasNextPage) {
		this.hasNextPage = hasNextPage;
	}

	
	

}