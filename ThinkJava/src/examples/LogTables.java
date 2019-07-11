package examples;

import java.util.Scanner;

public class LogTables {

	static Scanner console = new Scanner(System.in);

	public static void main(String[] args) {

		int i;

		System.out.println(" Enter i for for log:");
		i = console.nextInt();

		while (i < 10) {
			double x = i;
			System.out.println(x + " " + Math.log(x));
			i = i + 1;
		}
	}

}
