package TemplatePattern;

public abstract class Game {
	
	abstract void initialize();
	abstract void beginGame();
	abstract void  endGame();
	
	public final void play() {
		initialize();
		beginGame();
		endGame();
	}

}
