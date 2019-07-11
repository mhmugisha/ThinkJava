package examples;

import java.util.Scanner;

public class OutputStringandInt {

	public static void main(String[] args) {
		int age;
		String name;
		String gender;
		Scanner in = new Scanner(System.in);

		System.out.println("What is your name?");
		name = in.nextLine();

		System.out.println("What is your age?");
		age = in.nextInt();
		System.out.printf("Thank you %s, Now I know you are %d years old.\n", name, age);// %s formats string "name"
		// This works fine as long as the string "name" is output first and the int
		// "age" next.
		// But if the int age is output 1st, it does not let you input your name, it
		// will
		// give output without the name.
		// to fix that, insert in.nextLine after age = in.innextInt() but recall in that
		// case
		// it would be the first output in the place of name = in.nextLine.

		in.nextLine();

		System.out.println("What is your gender?");
		gender = in.nextLine();

		if (age >= 11)
			System.out.println("Now you are a big young man. Go and preach.");

	}

}
