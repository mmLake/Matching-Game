package edu.cpp.cs.cs141.prog_assgnmt_memoryGame;
// UI should call classes and methods from other classes
// and should overall piece the pieces together of the project.

import java.util.Scanner;

public class UserInterface {
	
	private int x;
	private int y;
	private GameEngine game = null;
	public Scanner kb = null;
	
	public UserInterface(GameEngine game) {
		this.game = game;
		kb = new Scanner(System.in);
	}

	public static void printWelcome() {	
		System.out.println("Welcome to the Memory Game.\n" + 
				"Find all the matching pairs of cards to win.\n" + 
				"Chose a card by inputing the position (x, y) of the card when prompted.\n" +
				"Once two cards are chosen, the cards will flip to reveal their symbols.\n" +
				"If the symbols match, the cards dissapear.\n" +
				"Keep going till the cards are all gone from the board.");
			System.out.println();
	}
	
	public void startGame() {
		printWelcome();
		mainMenu();
		gameLoop();
			
	}
	
	private void mainMenu() {
		boolean quit = false;
		int x = option();
		
		while(!quit) {
			switch(x) {
				case 1:
					gameLoop();
					break;
				case 2:
					quit = true;
					break;
				default:
					System.out.println("Invalid. print 1 or 2.");
					x = kb.nextInt();
					break;
			}
		}
	}

	private void gameLoop() {
		game.makeGrid();
		System.out.print(game.printGrid());
		
		//game.reset();
		System.out.println("New game starting");
		game.printGrid(); 
		
		this.getCard();
	}
		
	public Card getCard() {	
		while(!game.gameEnd()) {
			
			System.out.print("To chose a card, first input position x: ");
			x = kb.nextInt();
			while (x < 0 || x > 3) {
				System.out.print("Must chose a position between 0-3.\n" +
						"Chose a position again: ");
				x = kb.nextInt();
			}
			System.out.print("Now input position y: ");
			y = kb.nextInt();
			while (y < 0 || y > 3) {
				System.out.print("Must chose a position between 0-3.\n" +
					"Chose a second position again: ");
				y = kb.nextInt();
				}	
			
			}
		return game.chosenCard(x, y);
		}
	
	private int option() {
		int option = 2;
		
		System.out.println("Press 1 to start a new game.\n" +
				"Press 2 to quit.");
	
		if (option == 1 || option == 2) {
			option = kb.nextInt();
			kb.nextLine();
		}
		return option;
	}
	
	
	
	
}