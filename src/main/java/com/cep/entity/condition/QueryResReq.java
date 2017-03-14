package com.cep.entity.condition;

import java.util.List;



public class QueryResReq implements java.io.Serializable 
{
	private Long    createUserId;
	private Long    resId;
	private Long    fileId;
	private Integer unitId;
	private Integer stageId;
	private Integer textbookVersionId;
	private Integer courseId;
	private Integer GradeId;
	private List<Integer> listFileTypeId;
	private String  title;
	private String  keyword;
	
	
	public Long getCreateUserId() {
		return createUserId;
	}
	public void setCreateUserId(Long createUserId) {
		this.createUserId = createUserId;
	}
	public Long getResId() {
		return resId;
	}
	public void setResId(Long resId) {
		this.resId = resId;
	}
	public Long getFileId() {
		return fileId;
	}
	public void setFileId(Long fileId) {
		this.fileId = fileId;
	}
	public Integer getUnitId() {
		return unitId;
	}
	public void setUnitId(Integer unitId) {
		this.unitId = unitId;
	}
	public Integer getStageId() {
		return stageId;
	}
	public void setStageId(Integer stageId) {
		this.stageId = stageId;
	}
	public Integer getTextbookVersionId() {
		return textbookVersionId;
	}
	public void setTextbookVersionId(Integer textbookVersionId) {
		this.textbookVersionId = textbookVersionId;
	}
	public Integer getCourseId() {
		return courseId;
	}
	public void setCourseId(Integer courseId) {
		this.courseId = courseId;
	}
	public Integer getGradeId() {
		return GradeId;
	}
	public void setGradeId(Integer gradeId) {
		GradeId = gradeId;
	}
	
	public List<Integer> getListFileTypeId() {
		return listFileTypeId;
	}
	public void setListFileTypeId(List<Integer> listFileTypeId) {
		this.listFileTypeId = listFileTypeId;
	}
	public String getKeyword() {
		return keyword;
	}
	public void setKeyword(String keyword) {
		this.keyword = keyword;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	
	

}