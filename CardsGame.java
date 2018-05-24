import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class CardsGame {
	public static void main(String[] args) {
		Dealer dealer = new Dealer();
		Card[] hand = new Card[8];
		for(int x = 0 ; x < 8 ; x++) {
			hand[x] = dealer.getCard();
			hand[x].printCard();
			}
		Dealer sort = new Dealer();
		System.out.println(sort.convertToValue(null));
		System.out.println("Do You want new cards? y/n");

		Scanner sc = new Scanner(System.in);
		char c = sc.next().charAt(0);
/*		boolean deal = true;
		while(deal) {*/
			switch(c) {
			case 'y':
				for(int x = 0 ; x < 8 ; x++) {
					hand[x] = dealer.getCard();
					hand[x].printCard();
					}
				break;
			case 'n':
				System.out.println("good");
			break;
			default :
			//	deal = false;
				System.out.println("invalid entry please try again");
				break;
			}
		}
			
/*		dealer.convertToValue(dealer.getCard())	;
		
		Card[] sortedHand = new Card[8];
		boolean notSorted = false;
		while 	(notSorted)	
		for (int i = 0; i < 8; i++) {
			sortedHand[i]=dealer.convertToValue();

			//dealer.convertToValue();
		//sortedHand[i] = ;
		}
			*/
		
			
			
		
//		hand.sort();
	
	static void testFunctionality() {
	}
}
class Card{
	String suit;
	int value;
	void printCard() {
		String[] valueStrings = {"Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King"};
		System.out.println("Card: "+suit+" "+valueStrings[value]);
	}
}
class Dealer{
	String[] suits = {"Clubs","Diamonds","Spades","Hearts"};
	int[] values = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12};
	private int generateRandomNumber() {
		Random random = new Random();
		int generatedNumber = random.nextInt(52);
		return generatedNumber;
	}
	
	int convertToValue(Card cardIn) {
	
		int suitFactor = 0;
		
		switch(cardIn.suit) {
		
		case "Clubs":
			suitFactor = 4;
			break;
		case "Diamonds":
			suitFactor = 3;
			break;
		case "Spades":
			suitFactor = 2;
			break;
		case "Hearts":
			suitFactor = 1;
			break;
		}
		
		int cardValue = (suitFactor * 13) + cardIn.value;
		return cardValue;
	}
	private Card getCardFromNumber(int deckNumber) {
		Card card = new Card();
		card.value = deckNumber%13;
		card.suit = suits[deckNumber/13];
		return card;
	}
	Card getCard() {
		return getCardFromNumber(generateRandomNumber());
	}
/*	Card getSortedCard() {
		return getSortedCardNumber()
	}*/
}
