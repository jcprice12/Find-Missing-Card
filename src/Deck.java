import java.util.ArrayList;
import java.util.List;

public class Deck {
	
	public static final int FULL_DECK = 52;
	public static final int COMPLETE_TOTAL = 91;
	
	private List<Card> cards;
	
	public Deck() {
		this.cards = new ArrayList<Card>();
		for(Suit suit : Suit.values()) {
			for(int i = 1; i <= 13; i++) {
				Card card = new Card(suit, i);
				this.cards.add(card);
			}
		}
	}
	public Deck(List<Card> cards){
		this.setCards(cards);
	}
	
	public List<Card> getCards() {
		return cards;
	}
	public void setCards(List<Card> cards) {
		this.cards = cards;
	}
	
	public Card findMissingCard() {
		if (this.cards.size() != (FULL_DECK - 1)) {
			return null;
		}
		
		int hearts = 0;
		int diamonds = 0;
		int clubs = 0;
		int spades = 0;
		for(Card card : cards) {
			switch (card.getSuit()){
				case HEART:
					hearts += card.getValue();
					break;
				case SPADE:
					spades += card.getValue();
					break;
				case DIAMOND:
					diamonds += card.getValue();
					break;
				case CLUB:
					clubs += card.getValue();
			}
		}
		
		Card card = new Card();
		if(hearts != COMPLETE_TOTAL) {
			int value = COMPLETE_TOTAL - hearts;
			card.setSuit(Suit.HEART);
			card.setValue(value);
		} else if(diamonds != COMPLETE_TOTAL) {
			int value = COMPLETE_TOTAL - diamonds;
			card.setSuit(Suit.DIAMOND);
			card.setValue(value);
		} else if( clubs != COMPLETE_TOTAL) {
			int value = COMPLETE_TOTAL - clubs;
			card.setSuit(Suit.CLUB);
			card.setValue(value);
		} else {
			int value = COMPLETE_TOTAL - spades;
			card.setSuit(Suit.SPADE);
			card.setValue(value);
		}
		return card;
	}
	
	public void printDeck() {
		for(Card card : this.cards) {
			card.printInfo();
			System.out.println("");
		}
	}
}
