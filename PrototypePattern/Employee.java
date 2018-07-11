package PrototypePattern;

public class Employee implements Prototype {

	int id;
	String name;
	float salary;

	public Employee() {

	}

	public Employee(int id, String name, float salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	@Override
	public Prototype clone() {
		return new Employee(this.id, this.name, this.salary);
	}
	
	public void showInfo() {
		System.out.println("Employee Info: Name " + this.name + "Id: "+ this.id + "Salary : " + this.salary);
	}

}