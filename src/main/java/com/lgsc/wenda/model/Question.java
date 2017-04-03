package com.lgsc.wenda.model;

import java.io.Serializable;
import java.util.Date;

public class Question implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	private  Integer questionId;
	
	private  String title;
	
	private  String content;
	
	private  Date createDate;
	
	private  Integer userId;
	
	private  Integer commentCount;

	public Integer getQuestionId() {
		return questionId;
	}

	public void setQuestionId(Integer questionId) {
		this.questionId = questionId;
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

	public Date getCreateDate() {
		return createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public Integer getCommentCount() {
		return commentCount;
	}

	public void setCommentCount(Integer commentCount) {
		this.commentCount = commentCount;
	}

	@Override
	public String toString() {
		return "Question [questionId=" + questionId + ", title=" + title + ", content=" + content + ", createDate="
				+ createDate + ", userId=" + userId + ", commentCount=" + commentCount + "]";
	}
	
	
	

}
