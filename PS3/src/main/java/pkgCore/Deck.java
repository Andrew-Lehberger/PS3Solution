package pkgCore;

import java.util.ArrayList;
import java.util.Collections;

import pkgEnum.eRank;
import pkgEnum.eSuit;
import pkgException.DeckException;

public class Deck {

	private ArrayList<Card> cardsInDeck;

	public Deck() {
		for (eSuit eSuit : eSuit.values()) {
			for (eRank eRank : eRank.values()) {
				cardsInDeck.add(new Card(eSuit, eRank));
			}
		}
		Collections.shuffle(cardsInDeck);
	}

	public Card Draw(Deck d) throws DeckException {
		if(this.cardsInDeck.isEmpty()) {
			throw new DeckException(d);
		   
		}
		 return cardsInDeck.remove(0);
		
	}
	


	public Card DrawSuit(eSuit eSuit) {
		for (Card c : this.cardsInDeck) {
			if (c.geteSuit() == eSuit) {
				cardsInDeck.remove(c);
				return c;
			}
		}
		
		return null;
	}
	
	
	public Card DrawRank(eRank eRank) {
		for (Card c : this.cardsInDeck) {
			if (c.geteRank() == eRank) {
				cardsInDeck.remove(c);
				return c;
			}
		}
		
		return null;
	}
	
	
	public int SuitCount(eSuit eSuit) {
		int i = 0;
		for (Card c : this.cardsInDeck) {
			if (c.geteSuit() == eSuit) {
				return i++;
			}}
				return i;
		}

		
	
	public int RankCount(eRank eRank) {
		int i = 0;
		for (Card c : this.cardsInDeck) {
			if (c.geteRank() == eRank) {
				return i++;
			}}
				return i;
			}
	
	public int FindCard(Card c)
	{
		for (Card crds: cardsInDeck)
		{
			if (crds == c)
				return 1;
		}
		return 0;
	}
		
	}

