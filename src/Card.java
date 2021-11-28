//Card.java
//Card class represents a play card

public class Card {
	private final String face; // face of card ("Ace", "Deuce", etc.)
	private final String suit; // suit of the card ("Hearts", "Diamonds", etc.)

	// two-argument constructor to initialize card's face and suit
	public Card(String cardFace, String cardSuit) {
		this.face = cardFace; // initialize face of card
		this.suit = cardSuit; // initialize suit of card

	}

	// return String representation of Card
	@Override
	public String toString() {
		return face + " of " + suit;
	}

}
