package com.intellingence.entry;


public class LeftPlus {
	private boolean eversion;
	private boolean inversion;
	private LandingPosition landingPosition;
	private double stanceDurationMean;
	private double stepHeightMean;
	private double supportStabilityMean;
	private double swingWidthMean;
	public LeftPlus() {
		super();
		// TODO Auto-generated constructor stub
	}
	public LeftPlus(boolean eversion, boolean inversion, LandingPosition landingPosition, double stanceDurationMean,
			double stepHeightMean, double supportStabilityMean, double swingWidthMean) {
		super();
		this.eversion = eversion;
		this.inversion = inversion;
		this.landingPosition = landingPosition;
		this.stanceDurationMean = stanceDurationMean;
		this.stepHeightMean = stepHeightMean;
		this.supportStabilityMean = supportStabilityMean;
		this.swingWidthMean = swingWidthMean;
	}
	public boolean getEversion() {
		return eversion;
	}
	public void setEversion(boolean eversion) {
		this.eversion = eversion;
	}
	public boolean getInversion() {
		return inversion;
	}
	public void setInversion(boolean inversion) {
		this.inversion = inversion;
	}
	public LandingPosition getLandingPosition() {
		return landingPosition;
	}
	public void setLandingPosition(LandingPosition landingPosition) {
		this.landingPosition = landingPosition;
	}
	public double getStanceDurationMean() {
		return stanceDurationMean;
	}
	public void setStanceDurationMean(double stanceDurationMean) {
		this.stanceDurationMean = stanceDurationMean;
	}
	public double getStepHeightMean() {
		return stepHeightMean;
	}
	public void setStepHeightMean(double stepHeightMean) {
		this.stepHeightMean = stepHeightMean;
	}
	public double getSupportStabilityMean() {
		return supportStabilityMean;
	}
	public void setSupportStabilityMean(double supportStabilityMean) {
		this.supportStabilityMean = supportStabilityMean;
	}
	public double getSwingWidthMean() {
		return swingWidthMean;
	}
	public void setSwingWidthMean(double swingWidthMean) {
		this.swingWidthMean = swingWidthMean;
	}
	
}
