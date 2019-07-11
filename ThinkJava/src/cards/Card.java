package cards;

class Card {

	int suit, rank;

	/* ______________________________________________________ */
	// Constructor without parameters
	public Card() {
		this.suit = 0;
		this.rank = 0;
	}

	/* ______________________________________________________ */
	// constructor with parameters
	public Card(int suit, int rank) {
		this.suit = suit;
		this.rank = rank;
	}

	/* ______________________________________________________ */
	// Method to print a card object;
	public static void printCard(Card c) {
		String[] arraySuits = { "Clubs", "Diamonds", "Hearts", "Spades" };
		String[] arrayRanks = { "narf", "Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King" };

		System.out.println(arrayRanks[c.rank] + " of " + arraySuits[c.suit]);
	}

	/* ______________________________________________________ */
	// Method sameCard
	public static boolean sameCard(Card C1, Card C2) {
		return (C1.suit == C2.suit && C1.rank == C2.rank);

	}

	/* _______________________________________________________ */
	// Method compareCard
	public static int compareCard(Card C1, Card C2) {
		if (C1.suit > C2.suit)
			return 1;
		if (C1.suit < C2.suit)
			return -1;
		if (C1.rank > C2.rank)
			return 1;
		if (C1.rank < C2.rank)
			return -1;
		else
			return 0;
	}

	/* _______________________________________________________ */
	// Method printDeck of 52 cards.
	public static void printDeck(Card[] cards) {
		for (int i = 0; i < cards.length; i++) {
			printCard(cards[i]);
		}
	}

	/* _______________________________________________________ */
	// Method findCard - Linear seatch
	public static int findCard(Card[] cards, Card targetCard) {
		for (int i = 0; i < cards.length; i++) {

			if (sameCard(cards[i], targetCard)) {
				return i;
			}

		}
		return -1;
	}

	/* ______________________________________________________ */
	// Method findCard - Bisect search
	public static int findBisect(Card[] cards, Card card, int low, int high) {
		System.out.println(low + ", " + high);
		if (high < low)
			return -1;
		int mid = (high + low) / 2;
		int comp = compareCard(cards[mid], card);
		if (comp == 0) {
			return mid;
		} else if (comp > 0) {
			return findBisect(cards, card, low, mid - 1);
		} else {
			return findBisect(cards, card, mid + 1, high);
		}
	}

	/* ______________________________________________________ */
	// Method main
	public static void main(String[] args) {
		Card card1 = new Card(1, 11);
		printCard(card1);

		Card Card1 = new Card(3, 11);
		Card Card2 = new Card(1, 13);
		if (sameCard(Card1, Card2))
			System.out.println("Card1 and Card2 are equivalent");
		else
			System.out.println("The cards are not equivalent.");

		System.out.println(compareCard(Card1, Card2));
		
		
		
		//trying to invoke method findBisect
		//System.out.println(findBisect(cards, Card1, 0, 15));

	}
}
/*
 * COMMENTS ON METHOD printCard: the expression arraySuits[c.suit] 
 * means "use the instance variable suit from the object c as an 
 * index into the array named arraySuits, and select the appropriate 
 * string." So when you provide the object Card(1,11), you provide 
 * the value of suit = 1 and rank = 11 but for our purposes, 
 * c.suit will take only the 1, and c.rank will take the other. 
 * So arraySuits[c.suit] becomes arraySuits[1] and the suit in 
 * position 1 is Diamonds. Similar for c.rank. The output then 
 * becomes Jack of Diamonds)
 */
