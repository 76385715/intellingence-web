package com.intellingence.dao;

import com.intellingence.entry.General;
import com.intellingence.entry.Header;
import com.intellingence.entry.LeftPlus;
import com.intellingence.entry.RightPlus;

public class ChuangGanVoPlus {
	private General general;
	private Header header;
	private LeftPlus left;
	private RightPlus right;
	public ChuangGanVoPlus() {
		super();
		// TODO Auto-generated constructor stub
	}
	public ChuangGanVoPlus(General general, Header header, LeftPlus left, RightPlus right) {
		super();
		this.general = general;
		this.header = header;
		this.left = left;
		this.right = right;
	}
	public General getGeneral() {
		return general;
	}
	public void setGeneral(General general) {
		this.general = general;
	}
	public Header getHeader() {
		return header;
	}
	public void setHeader(Header header) {
		this.header = header;
	}
	public LeftPlus getLeft() {
		return left;
	}
	public void setLeft(LeftPlus left) {
		this.left = left;
	}
	public RightPlus getRight() {
		return right;
	}
	public void setRight(RightPlus right) {
		this.right = right;
	}
	@Override
	public String toString() {
		return "ChuangGanVoPlus [general=" + general + ", header=" + header + ", left=" + left + ", right=" + right
				+ "]";
	}
	
}
