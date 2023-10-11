package com.bmi.calculator;


public class BMI {
	
	private float weight;
	private float height;
	public float getWeight() {
		return weight;
	}
	public void setWeight(float weight) {
		this.weight = weight;
	}
	public float getHeight() {
		return height;
	}
	public void setHeight(float height) {
		this.height = height;
	}
	
	public double getBMIIndex() {
		return weight/(height*height);
	}
	

}
