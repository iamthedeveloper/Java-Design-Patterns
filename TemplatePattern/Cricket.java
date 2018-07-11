
package TemplatePattern;

public class Cricket extends Game{

	@Override
	void initialize() {
		System.out.println("Cricekt Initialized!");
	}

	@Override
	void beginGame() {
		System.out.println("Cricekt Begining!");
	}

	@Override
	void endGame() {
		System.out.println("Cricekt Ending!");
	}

}
