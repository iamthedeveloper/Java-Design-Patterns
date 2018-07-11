package CompositeDesignPattern;

public class Manager implements IEmployee {

	String name;
	String role;

	@Override
	public void ShowEmployee() {
		System.out.println("Employee  Info : " + name + " : "+  role);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

}
