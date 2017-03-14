package com.cep.protocol.news;

/**
 * NewsOptReq
 * @author 高聪 
 * 操作请求
 */
public class NewsOptReq implements java.io.Serializable {
	private Long id;
	private String content;
	private Long newsId;

	public Long getNewsId() {
		return newsId;
	}

	public void setNewsId(Long newsId) {
		this.newsId = newsId;
	}




	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}
}