package com.intellingence.pojo;

import java.io.Serializable;

public class HealthDataQueryVo implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String year;
	private String month;
	private String week;
	private Integer userid;
	private String quarter;
	private Integer aliveness;
	public HealthDataQueryVo() {
		super();
		// TODO Auto-generated constructor stub
	}
	public HealthDataQueryVo(String year, String month, String week, Integer userid, String quarter,
			Integer aliveness) {
		super();
		this.year = year;
		this.month = month;
		this.week = week;
		this.userid = userid;
		this.quarter = quarter;
		this.aliveness = aliveness;
	}
	public String getYear() {
		return year;
	}
	public void setYear(String year) {
		this.year = year;
	}
	public String getMonth() {
		return month; 
	}
	public void setMonth(String month) {
		this.month = month;
	}
	public String getWeek() {
		return week;
	}
	public void setWeek(String week) {
		this.week = week;
	}
	public Integer getUserid() {
		return userid;
	}
	public void setUserid(Integer userid) {
		this.userid = userid;
	}
	public String getQuarter() {
		return quarter;
	}
	public void setQuarter(String quarter) {
		this.quarter = quarter;
	}
	public Integer getAliveness() {
		return aliveness;
	}
	public void setAliveness(Integer aliveness) {
		this.aliveness = aliveness;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	@Override
	public String toString() {
		return "HealthDataQueryVo [year=" + year + ", month=" + month + ", week=" + week + ", userid=" + userid
				+ ", quarter=" + quarter + ", aliveness=" + aliveness + "]";
	}
	
	
}
