package StrategyPattern;

public class Dog extends Animal {

	Dog() {
		super();
		flyingType = new NotFlying();
		System.out.println("I am Dog!");
	}
	
	public void flying() {
		super.flyHere();
	}
	
}
