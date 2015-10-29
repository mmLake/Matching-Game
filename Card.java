package edu.cpp.cs.cs141.prog_assgnmt_memoryGame;
// The abstract card class lets us know that two values
// exist for each card: the 'back' and front of the card. 
// Additionally this class lets us know that each 
// card will also be flipped up (boolean = true) or flipped down. 

public abstract class Card {
	private String face;
	private String back; 
	private boolean isFlipped = false;
	
	public Card(String face, String back) {
		this.face = face;
		this.back = back;
	}

	public String getFace() {
		return face;
	}

	public String getBack() {
		return back;
	}

	public boolean isFlipped() {
		return isFlipped;
	}

	public void setFlipped(boolean isFlipped) {
		this.isFlipped = isFlipped;
	}
	
}
	
	
	
	//public void setMatched(boolean matched){
		//this.matched = matched;
	//}
	
	//public boolean getMatched(){
		//return this.matched;
	//}
	
