package com.intellingence.entry;

import java.io.Serializable;

/**
 * 短信验证接口的状态信息
 * @author wangqt
 *
 */
public class VerificationStatus implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int status;

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public VerificationStatus() {
		super();
		// TODO Auto-generated constructor stub
	}

	public VerificationStatus(int status) {
		super();
		this.status = status;
	}
	
}
