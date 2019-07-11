package exercises;

public class Time {

	public static void main(String[] args) {
		int hour = 19;
		int minute = 24;
		int second = 10;

		int secondsSinceMidnight = (hour * 3600 + minute * 60 + second);
		int secondsRemainingInDay = 24 * 3600 - secondsSinceMidnight;
		int secondsInDay = 24 * 3600; //temp variable
		int percentageOfDaySpent = (secondsSinceMidnight * 100) / secondsInDay;

		System.out.println("Seconds Since Midnight: " + secondsSinceMidnight);
		System.out.println("Seconds Remaining in Day: " + secondsRemainingInDay);
		System.out.println("Percentage of day passed: " + percentageOfDaySpent + "%");
		

	}

}
