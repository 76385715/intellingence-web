package com.intellingence.pojo;

public class HealthdataQueryAndUserId extends HealthdataQuery{
	protected int userId;

	protected int  aliveness;
	public HealthdataQueryAndUserId() {
		super();
		// TODO Auto-generated constructor stub
	}
	public HealthdataQueryAndUserId(int userId, int aliveness) {
		super();
		this.userId = userId;
		this.aliveness = aliveness;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public int getAliveness() {
		return aliveness;
	}
	public void setAliveness(int aliveness) {
		this.aliveness = aliveness;
	}

	
}
