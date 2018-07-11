package StrategyPattern;

public class Bird extends Animal{

	Bird() {
		super();
		flyingType =  new Flying();
	}
	
	public void flying() {
		super.flyHere();
	}
}
