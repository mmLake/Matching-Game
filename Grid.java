package edu.cpp.cs.cs141.prog_assgnmt_memoryGame;
// the Grid class 1) stores all the Cards in a double array
// 2) Will shuffle the double Array of Cards
// 3) Allow us to access a card given its xy coordinates
// 4) Return a String value for any given xy coordinates of a card
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Grid {
	
	public Card[][] grid = new Card[4][4];
	
	public void initializeGrid(){
		grid[0][0] = new CardAst();
		grid[0][1] = new CardAst();
		grid[0][2] = new CardExcl();
		grid[0][3] = new CardExcl();
		grid[1][0] = new CardHashTag();
		grid[1][1] = new CardHashTag();
		grid[1][2] = new CardMinus();
		grid[1][3] = new CardMinus();
		grid[2][0] = new CardPercent();
		grid[2][1] = new CardPercent();
		grid[2][2] = new CardPlus();
		grid[2][3] = new CardPlus();
		grid[3][0] = new CardQ();
		grid[3][1] = new CardQ();
		grid[3][2] = new CardSlash();
		grid[3][3] = new CardSlash();
		shuffle();
	}
	
	public void shuffle() {
		List<Card> cardsList = new ArrayList<Card>();
	
		for (int i = 0; i < grid.length; i++) {
			for (int j = 0; j < grid[i].length; j++) {
				cardsList.add(grid[i][j]);
			}
		}
		
		Collections.shuffle(cardsList);
		
		int countVar = 0;
		
		for (int i = 0; i < grid.length; i++) {
			for (int j = 0; j < grid.length; j++) {
				grid[i][j] = cardsList.get(countVar);
				countVar++;
			}
		}	
	}	
	
	public Card cardAt(int i, int j) {
		return grid[i][j];
	}
	
	public String toString() {
		String printCard = "";
		for (Card[] row : grid) {
			for (Card m : row) {
				if (m.isFlipped()) {
					printCard += m.getFace();
				}
				else printCard += m.getBack();
			}
			printCard += "\n";
		}
		return printCard;
	}


}		
	