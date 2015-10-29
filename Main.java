
package edu.cpp.cs.cs141.prog_assgnmt_memoryGame;
// the Main class simply starts the program

public class Main {
	
	public static void main(String[] args) {
		UserInterface ui = new UserInterface(new GameEngine());
		ui.startGame();
	}	
}
