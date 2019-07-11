package cards;

public class Print {

	public static void main(String[] args) {
	String[] suit = {"Clubs", "Diamonds", "Hearts", "Spades"};
	int[] rank = {1,2,3,4,5,6,7,8,9};
	
	for(int i = 0; i<suit.length; i++) {
		for (int j = 0; j<rank.length; j++) {
			System.out.println(rank[j]+ " of " + suit[i]);
		}
	
	}

	
	
	
	
	}
	
	

}
