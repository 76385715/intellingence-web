package com.intellingence.entry;
/**
 * 创感科技步态算法的获取access token的 QueryVo类
 * @author 梦里不知身是客
 *
 */
public class StepAPIVo {
	private String grant_type;
	private String client_id;
	private String client_secret;
	private String access_token;
	private String token_type;
	private String expires_in;
	private String scope;
	private String error;
	private String error_description;
	public StepAPIVo() {
		super();
		// TODO Auto-generated constructor stub
	}
	public StepAPIVo(String grant_type, String client_id, String client_secret, String access_token, String token_type,
			String expires_in, String scope, String error, String error_description) {
		super();
		this.grant_type = grant_type;
		this.client_id = client_id;
		this.client_secret = client_secret;
		this.access_token = access_token;
		this.token_type = token_type;
		this.expires_in = expires_in;
		this.scope = scope;
		this.error = error;
		this.error_description = error_description;
	}
	public String getGrant_type() {
		return grant_type;
	}
	public void setGrant_type(String grant_type) {
		this.grant_type = grant_type;
	}
	public String getClient_id() {
		return client_id;
	}
	public void setClient_id(String client_id) {
		this.client_id = client_id;
	}
	public String getClient_secret() {
		return client_secret;
	}
	public void setClient_secret(String client_secret) {
		this.client_secret = client_secret;
	}
	public String getAccess_token() {
		return access_token;
	}
	public void setAccess_token(String access_token) {
		this.access_token = access_token;
	}
	public String getToken_type() {
		return token_type;
	}
	public void setToken_type(String token_type) {
		this.token_type = token_type;
	}
	public String getExpires_in() {
		return expires_in;
	}
	public void setExpires_in(String expires_in) {
		this.expires_in = expires_in;
	}
	public String getScope() {
		return scope;
	}
	public void setScope(String scope) {
		this.scope = scope;
	}
	public String getError() {
		return error;
	}
	public void setError(String error) {
		this.error = error;
	}
	public String getError_description() {
		return error_description;
	}
	public void setError_description(String error_description) {
		this.error_description = error_description;
	}
	@Override
	public String toString() {
		return "StepAPIVo [grant_type=" + grant_type + ", client_id=" + client_id + ", client_secret=" + client_secret
				+ ", access_token=" + access_token + ", token_type=" + token_type + ", expires_in=" + expires_in
				+ ", scope=" + scope + ", error=" + error + ", error_description=" + error_description + "]";
	}
	
}
