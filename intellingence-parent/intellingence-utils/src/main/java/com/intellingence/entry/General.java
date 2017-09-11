package com.intellingence.entry;

public class General {
	//数据质量，反映本次测试是否有效，good好，qualified合格、unqualified不合格
	private String dataQuality;
	//测量时长
	private double duration;
	//步数
	private int stepCount;
	//步频
	private double stepRate;
	//步长
	private double strideLength;
	//对称性
	private double symmetry;
	//稳定性
	private double variability;
	public General() {
		super();
		// TODO Auto-generated constructor stub
	}
	public General(String dataQuality, double duration, int stepCount, double stepRate, double strideLength,
			double symmetry, double variability) {
		super();
		this.dataQuality = dataQuality;
		this.duration = duration;
		this.stepCount = stepCount;
		this.stepRate = stepRate;
		this.strideLength = strideLength;
		this.symmetry = symmetry;
		this.variability = variability;
	}
	public String getDataQuality() {
		return dataQuality;
	}
	public void setDataQuality(String dataQuality) {
		this.dataQuality = dataQuality;
	}
	public double getDuration() {
		return duration;
	}
	public void setDuration(double duration) {
		this.duration = duration;
	}
	public int getStepCount() {
		return stepCount;
	}
	public void setStepCount(int stepCount) {
		this.stepCount = stepCount;
	}
	public double getStepRate() {
		return stepRate;
	}
	public void setStepRate(double stepRate) {
		this.stepRate = stepRate;
	}
	public double getStrideLength() {
		return strideLength;
	}
	public void setStrideLength(double strideLength) {
		this.strideLength = strideLength;
	}
	public double getSymmetry() {
		return symmetry;
	}
	public void setSymmetry(double symmetry) {
		this.symmetry = symmetry;
	}
	public double getVariability() {
		return variability;
	}
	public void setVariability(double variability) {
		this.variability = variability;
	}
	
	
}
