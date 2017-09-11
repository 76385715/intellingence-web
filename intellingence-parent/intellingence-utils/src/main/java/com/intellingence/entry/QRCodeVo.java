package com.intellingence.entry;

public class QRCodeVo {
	private String uid;
	private String id;
	private String token;
	private String userParam;
	private String ci_session;
	public QRCodeVo() {
		super();
		// TODO Auto-generated constructor stub
	}
	public QRCodeVo(String uid, String id, String token, String userParam, String ci_session) {
		super();
		this.uid = uid;
		this.id = id;
		this.token = token;
		this.userParam = userParam;
		this.ci_session = ci_session;
	}
	public String getUid() {
		return uid;
	}
	public void setUid(String uid) {
		this.uid = uid;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getToken() {
		return token;
	}
	public void setToken(String token) {
		this.token = token;
	}
	public String getUserParam() {
		return userParam;
	}
	public void setUserParam(String userParam) {
		this.userParam = userParam;
	}
	public String getCi_session() {
		return ci_session;
	}
	public void setCi_session(String ci_session) {
		this.ci_session = ci_session;
	}
	@Override
	public String toString() {
		return "QRCodeVo [uid=" + uid + ", id=" + id + ", token=" + token + ", userParam=" + userParam + ", ci_session="
				+ ci_session + "]";
	}
	
	
}
