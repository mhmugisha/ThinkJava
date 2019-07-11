package examples;

import java.util.Scanner;

public class ValueMethods {

	static Scanner console = new Scanner(System.in);

	public static void main(String args[]) {

		int n;

		System.out.println(" Enter n for count down:");
		n = console.nextInt();

		while (n > 0) {
			System.out.println(n);
			n = n - 1;
		}
		System.out.println("Blastoff!");
	}

}
