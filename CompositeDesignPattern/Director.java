package CompositeDesignPattern;

import java.util.ArrayList;
import java.util.List;

public class Director implements IEmployee {

	String name, role;

	List<IEmployee> listEmployee = new ArrayList<IEmployee>();

	@Override
	public void ShowEmployee() {
		for (IEmployee employee : listEmployee) {
				employee.ShowEmployee();
		}
	}

	public void addEmployee(IEmployee employee) {
		listEmployee.add(employee);
	}

	public void removeEmployee(IEmployee employee) {
		listEmployee.remove(employee);
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
