package examples;

import java.util.Random;
import java.util.Scanner;

public class GuessingGame {

	public static void main(String[] args) {

		int guessedNumber;
		Scanner in = new Scanner(System.in);

		Random random = new Random();
		int number = random.nextInt(100) + 1;// the result of nextInt(100) will be between
		// 0 and 99, including both.
		// Adding 1 yields a number between 1 and 100, including both.
		System.out.println("I am thinking of a number btn 0 and 100 inclusive, " + "can you guess it?");
		System.out.println("Enter your guess:");
		guessedNumber = in.nextInt();

		System.out.println("The number I was thinking of is:" + number);

		if (number == guessedNumber)
			System.out.println("Wow you are a genius dude!! You got it");
		else if (number != guessedNumber)
			System.out.println("Sorry you are off by: " + Math.abs(number - guessedNumber));

	}

}
