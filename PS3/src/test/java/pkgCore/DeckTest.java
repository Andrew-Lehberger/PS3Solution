package pkgCore;

import static org.junit.Assert.*;


import org.junit.Test;

import pkgEnum.eRank;
import pkgEnum.eSuit;

public class DeckTest {

	@Test
	public void TestEmptyDeck() {
		
	
	}
	
	@Test
	public void TestDrawSuit() {
		Deck testDeck3 = new Deck();
		testDeck3.DrawSuit(eSuit.DIAMONDS);
		testDeck3.DrawRank(eRank.SEVEN);
		testDeck3.DrawSuit(eSuit.CLUBS);
		testDeck3.DrawRank(eRank.ACE);
		testDeck3.DrawSuit(eSuit.HEARTS);
		testDeck3.DrawRank(eRank.FOUR);
		testDeck3.DrawSuit(eSuit.DIAMONDS);
		testDeck3.DrawRank(eRank.JACK);
		
		assertEquals(testDeck3.DrawSuit(eSuit.HEARTS),(eSuit.HEARTS));
		assertEquals(testDeck3.DrawSuit(eSuit.HEARTS),(eSuit.CLUBS));
		
		
		
	
	@Test
	public void TestDrawRank() {
		
		Deck testDeck4 = new Deck();
		testDeck4.DrawSuit(eSuit.HEARTS);
		testDeck4.DrawRank(eRank.SEVEN);
		testDeck4.DrawSuit(eSuit.CLUBS);
		testDeck4.DrawRank(eRank.ACE);
		testDeck4.DrawSuit(eSuit.HEARTS);
		testDeck4.DrawRank(eRank.FOUR);
		testDeck4.DrawSuit(eSuit.DIAMONDS);
		testDeck4.DrawRank(eRank.JACK);
		
		assertEquals(testDeck4.DrawRank(eRank.SEVEN),(eRank.SEVEN));
		assertEquals(testDeck4.DrawRank(eRank.SEVEN),(eRank.ACE));
	}
	
	@Test
	public void TestDeckRankCount() {
		
		Deck testDeck1 = new Deck();
		testDeck1.DrawRank(eRank.QUEEN);
		testDeck1.DrawRank(eRank.QUEEN);
		assertEquals(testDeck1.RankCount(eRank.QUEEN),2);

	}
		
		
	@Test
	public void TestDeckSuitCount() {
		
		Deck testDeck2 = new Deck();
		testDeck2.DrawSuit(eSuit.DIAMONDS);
		testDeck2.DrawSuit(eSuit.DIAMONDS);
		testDeck2.DrawSuit(eSuit.DIAMONDS);
		testDeck2.DrawSuit(eSuit.DIAMONDS);
		assertEquals(testDeck2.SuitCount(eSuit.DIAMONDS),4);
	}

}
