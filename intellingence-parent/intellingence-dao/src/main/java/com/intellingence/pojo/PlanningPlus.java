package com.intellingence.pojo;

import java.io.Serializable;
import java.util.Date;

public class PlanningPlus implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private Integer id;

    private Integer userid;

    private String title;
    
    private String date;

    private String datetime;

    private String updatatime;

    private String content;

	public PlanningPlus() {
		super();
		// TODO Auto-generated constructor stub
	}

	public PlanningPlus(Integer id, Integer userid, String title, String date, String datetime, String updatatime,
			String content) {
		super();
		this.id = id;
		this.userid = userid;
		this.title = title;
		this.date = date;
		this.datetime = datetime;
		this.updatatime = updatatime;
		this.content = content;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getUserid() {
		return userid;
	}

	public void setUserid(Integer userid) {
		this.userid = userid;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getDatetime() {
		return datetime;
	}

	public void setDatetime(String datetime) {
		this.datetime = datetime;
	}

	public String getUpdatatime() {
		return updatatime;
	}

	public void setUpdatatime(String updatatime) {
		this.updatatime = updatatime;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
    

}
