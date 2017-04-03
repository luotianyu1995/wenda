package com.lgsc.wenda.model;

import java.io.Serializable;

public class User implements Serializable{

	private static final long serialVersionUID = 1L;
	
	private Integer userId;
	
	private String userName;
	
	private String password;
	
    private String salt;
	
	private String  headUrl;

	
	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	
	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getSalt() {
		return salt;
	}

	public void setSalt(String salt) {
		this.salt = salt;
	}

	public String getHeadUrl() {
		return headUrl;
	}

	public void setHeadUrl(String headUrl) {
		this.headUrl = headUrl;
	}

	
	
	

}
