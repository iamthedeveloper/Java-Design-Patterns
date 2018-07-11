package CompositeDesignPattern;

public class CompositeDesignPatternDemo {

	public static void main(String[] args) {

		Director techdirector = new Director();

		Developer sDeveloper = new Developer();
		sDeveloper.setName("Kranti");
		sDeveloper.setRole("Senior Developer");

		Developer jDeveloper = new Developer();
		jDeveloper.setName("Kumar");
		jDeveloper.setRole("Java Developer");

		Manager techManager = new Manager();
		techManager.setName("Maha");
		techManager.setRole("Tech Manager");

		techdirector.addEmployee(techManager);
		techdirector.addEmployee(sDeveloper);

		Director acctDirector = new Director();
		acctDirector.addEmployee(jDeveloper);
		acctDirector.addEmployee(techdirector);

		acctDirector.ShowEmployee();

	}
}
