package com.intellingence.entry;

public class LandingPosition {
	private String frontal;
	private String sagital;
	public LandingPosition() {
		super();
		// TODO Auto-generated constructor stub
	}
	public LandingPosition(String frontal, String sagital) {
		super();
		this.frontal = frontal;
		this.sagital = sagital;
	}
	public String getFrontal() {
		return frontal;
	}
	public void setFrontal(String frontal) {
		this.frontal = frontal;
	}
	public String getSagital() {
		return sagital;
	}
	public void setSagital(String sagital) {
		this.sagital = sagital;
	}
	
}
