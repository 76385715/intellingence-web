package com.intellingence.entry;

import java.io.Serializable;

public class AmsuVo implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 5695023748950178701L;
	private String ret;
	private Object errDesc;
	
	public AmsuVo() {
		super();
		// TODO Auto-generated constructor stub
	}
	public AmsuVo(String ret, Object errDesc) {
		super();
		this.ret = ret;
		this.errDesc = errDesc;
	}
	public String getRet() {
		return ret;
	}
	public void setRet(String ret) {
		this.ret = ret;
	}
	public Object getErrDesc() {
		return errDesc;
	}
	public void setErrDesc(Object errDesc) {
		this.errDesc = errDesc;
	}
	
}
