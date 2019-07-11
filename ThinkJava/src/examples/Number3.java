package examples;

import java.util.Scanner;

public class Number3 {

	public static void main(String[] args) {

		int time;
		int hours;
		int minutes;
		int seconds;

		Scanner in = new Scanner(System.in);
		System.out.println("Enter time in seconds:");
		time = in.nextInt();

		hours = time / 3600;
		minutes = (time - hours * 3600) / 60;
		seconds = (time - hours * 3600) % 60;

		System.out.printf("%d Seconds = %d hours, %d minutes and %d Seconds\n", time, hours, minutes, seconds);

	}

}
