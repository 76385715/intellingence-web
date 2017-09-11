package com.intellingence.entry;

public class ChuangGanVo {

	private String id;
	private String uuid;
	private String creationTime;
	private String type;
	private String description;
	private Url url;
	public ChuangGanVo() {
		super();
		// TODO Auto-generated constructor stub
	}
	public ChuangGanVo(String id, String uuid, String creationTime, String type, String description, Url url) {
		super();
		this.id = id;
		this.uuid = uuid;
		this.creationTime = creationTime;
		this.type = type;
		this.description = description;
		this.url = url;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getUuid() {
		return uuid;
	}
	public void setUuid(String uuid) {
		this.uuid = uuid;
	}
	public String getCreationTime() {
		return creationTime;
	}
	public void setCreationTime(String creationTime) {
		this.creationTime = creationTime;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Url getUrl() {
		return url;
	}
	public void setUrl(Url url) {
		this.url = url;
	}
	
}
