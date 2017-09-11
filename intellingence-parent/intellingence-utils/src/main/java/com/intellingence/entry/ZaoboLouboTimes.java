package com.intellingence.entry;

public class ZaoboLouboTimes {
	private Integer zaoboTimes;
	private Integer louboTimes;
	public ZaoboLouboTimes() {
		super();
		// TODO Auto-generated constructor stub
	}
	public ZaoboLouboTimes(Integer zaoboTimes, Integer louboTimes) {
		super();
		this.zaoboTimes = zaoboTimes;
		this.louboTimes = louboTimes;
	}
	public Integer getZaoboTimes() {
		return zaoboTimes;
	}
	public void setZaoboTimes(Integer zaoboTimes) {
		this.zaoboTimes = zaoboTimes;
	}
	public Integer getLouboTimes() {
		return louboTimes;
	}
	public void setLouboTimes(Integer louboTimes) {
		this.louboTimes = louboTimes;
	}
	@Override
	public String toString() {
		return "ZaoboLouboTimes [zaoboTimes=" + zaoboTimes + ", louboTimes=" + louboTimes + "]";
	}
	
}
