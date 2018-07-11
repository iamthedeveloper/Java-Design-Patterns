package StrategyPattern;

public interface Flys {

	String fly();
}

class Flying implements Flys {
	public String fly() {
		return "I am Flying High!";
	}
}

class NotFlying implements Flys {
	public String fly() {
		return "I cannot Fly High!";
	}
}
