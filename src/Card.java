
public class Card {
	private Suit suit;
	private int value;
	
	public Card() {
		//intentionally blank
	}
	public Card(Suit suit, int value) {
		this.setSuit(suit);
		this.setValue(value);
	}
	
	public Suit getSuit() {
		return suit;
	}
	public void setSuit(Suit suit) {
		this.suit = suit;
	}
	public int getValue() {
		return value;
	}
	public void setValue(int value) {
		this.value = value;
	}
	
	public void printInfo() {
		System.out.println("Suit: " + this.suit.toString());
		System.out.println("Value: " + this.value);
	}
}
