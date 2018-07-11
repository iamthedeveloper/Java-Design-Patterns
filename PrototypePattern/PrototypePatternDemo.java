package PrototypePattern;

public class PrototypePatternDemo {

	public static void main(String[] args) {
		Prototype employee = new Employee(100, "Kranti", 8000);
		Prototype employeeCloned = (Employee) employee.clone();
		
		employee.showInfo();
		employeeCloned.showInfo();
	}
}
