package com.cep.protocol.news;

public class NewsListReq implements java.io.Serializable {

    private Long    classId;
	private Integer count;
	private String  timeStart;
	private String  timeLastUpdate;

	
	
	public Long getClassId() {
		return classId;
	}
	public void setClassId(Long classId) {
		this.classId = classId;
	}
	public Integer getCount() {
		return count;
	}
	public void setCount(Integer count) {
		this.count = count;
	}
	public String getTimeStart() {
		return timeStart;
	}
	public void setTimeStart(String timeStart) {
		this.timeStart = timeStart;
	}
	public String getTimeLastUpdate() {
		return timeLastUpdate;
	}
	public void setTimeLastUpdate(String timeLastUpdate) {
		this.timeLastUpdate = timeLastUpdate;
	}


}