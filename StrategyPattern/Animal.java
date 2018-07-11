package StrategyPattern;

public class Animal {

	String name;
	double height, weight;
	
	//Strategy Pattern
	Flys flyingType;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	
	public void setFly(Flys flyingType) {
		this.flyingType = flyingType;
	}
	
	public String flyHere() {
		return flyingType.fly();
	}
	
}
