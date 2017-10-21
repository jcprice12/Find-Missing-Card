import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class FindCardTest {
	@Test
	public void testFindMissingCardHappy() {
		Deck deck1 = new Deck();
		deck1.getCards().remove(15);//remove card at index 15 (should be 3 of Hearts)
		Card card = deck1.findMissingCard();
		assertEquals(Suit.HEART, card.getSuit());
		assertEquals(3, card.getValue());
	}
}
