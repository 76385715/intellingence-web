package com.intellingence.pojo;

import java.io.Serializable;

public class Paging implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	//第几页
	private Integer preNumbers;
	//一页多少条数据
	private Integer aftNumbers;
	private Integer userID;
	public Paging() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Paging(Integer preNumbers, Integer aftNumbers, Integer userID) {
		super();
		this.preNumbers = preNumbers;
		this.aftNumbers = aftNumbers;
		this.userID = userID;
	}
	public Integer getPreNumbers() {
		return preNumbers;
	}
	public void setPreNumbers(Integer preNumbers) {
		this.preNumbers = preNumbers;
	}
	public Integer getAftNumbers() {
		return aftNumbers;
	}
	public void setAftNumbers(Integer aftNumbers) {
		this.aftNumbers = aftNumbers;
	}
	public Integer getUserID() {
		return userID;
	}
	public void setUserID(Integer userID) {
		this.userID = userID;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
}
