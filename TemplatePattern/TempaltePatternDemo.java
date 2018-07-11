
package TemplatePattern;

public class TempaltePatternDemo {

	public static void main(String[] args) {
		Game cricket = new Cricket();
		cricket.play();
		
		cricket = new FootBall();
		cricket.play();
	}
}
