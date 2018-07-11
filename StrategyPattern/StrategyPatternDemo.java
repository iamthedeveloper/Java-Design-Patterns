package StrategyPattern;

public class StrategyPatternDemo {

	public static void main(String[] args) {
		Animal bullpit = new Dog();
		System.out.println("Bullpit:" + bullpit.flyHere());
		
		Animal parrot = new Bird();
		System.out.println("Parrot:" + parrot.flyHere());
		
		bullpit.setFly(new Flying());
		System.out.println("Bullpit:" + bullpit.flyHere());
	}
}
