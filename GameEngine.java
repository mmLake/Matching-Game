package edu.cpp.cs.cs141.prog_assgnmt_memoryGame;
//The gameEngine primarily acts as a middle man of information 
//between the User Interface and the other classes of code.
//This game engine will let us instantiate/ print a new Grid,
// it will let us know if two cards have the same symbol,
// and let us know if the game has been finished. 

public class GameEngine {
	
	private Grid gameGrid = new Grid();
	
	public void makeGrid(){
		gameGrid.initializeGrid();
	}
	
	public String printGrid() {
		return gameGrid.toString();
	}
	
	public Card chosenCard(int i, int j) {
		return gameGrid.cardAt(i, j);
	}

	public boolean isMatch(int x, int y, int i, int j) {
		if (this.chosenCard(x, y).getFace().equals(this.chosenCard(i, j).getFace())) {
		this.chosenCard(x, y).setFlipped(true);
		this.chosenCard(i, j).setFlipped(true);	
			return true;
		}
		else 
			return false;
	}
	
	public boolean gameEnd() {
		int count = 0;
		for (int i = 0; i < 4; i++ ) {
			for (int j = 0; j < 4; j++) {
				if (this.chosenCard(i, j).isFlipped()){	
					count++;
				}
			}
		}
		if (count == 16)
			return true;
		else 
			return false;
	}
	
	public void reset() {
		gameGrid = new Grid();
	}
}