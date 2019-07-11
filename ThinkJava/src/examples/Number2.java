package examples;

import java.util.Scanner;

public class Number2 {

	public static void main(String[] args) {
		double celcius;
		double fahrenheit;
		Scanner in = new Scanner(System.in);

		System.out.println("Enter degrees in Celius:");
		celcius = in.nextDouble();

		fahrenheit = celcius * (9.0 / 5.0) + 32;

		System.out.printf("%.1fC = %.1fF", celcius, fahrenheit);
	}

}
