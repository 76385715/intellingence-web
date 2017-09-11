package com.intellingence.entry;

public class Header {
	//建议
	private String comment;
	//创建日期
	private String creationTime;
	//描述
	private String description;
	//测试类型，walking步行，running跑步
	private String type;
	//报告的uuid
	private String uuid;
	//算法版本
	private String version;
	public Header() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Header(String comment, String creationTime, String description, String type, String uuid, String version) {
		super();
		this.comment = comment;
		this.creationTime = creationTime;
		this.description = description;
		this.type = type;
		this.uuid = uuid;
		this.version = version;
	}
	public String getComment() {
		return comment;
	}
	public void setComment(String comment) {
		this.comment = comment;
	}
	public String getCreationTime() {
		return creationTime;
	}
	public void setCreationTime(String creationTime) {
		this.creationTime = creationTime;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getUuid() {
		return uuid;
	}
	public void setUuid(String uuid) {
		this.uuid = uuid;
	}
	public String getVersion() {
		return version;
	}
	public void setVersion(String version) {
		this.version = version;
	}
	
}
