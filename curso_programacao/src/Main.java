import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("What day is today?");
		System.out.print("> ");
		int dayNumber = scanner.nextInt();
		String dayWeek;
		
		switch (dayNumber) {
		case 1:
			dayWeek = "Sunday";
			break;
		case 2:
			dayWeek = "Monday";
			break;
		case 3:
			dayWeek = "Tuesday";
			break;
		case 4:
			dayWeek = "Wednesday";
			break;
		case 5:
			dayWeek = "Thursday";
			break;
		case 6:
			dayWeek = "Friday";
			break;
		case 7:
			dayWeek = "Saturday";
			break;
		default:
			dayWeek = "Invalid";
			break;
		}
		
		System.out.println("Day of Week: " + dayWeek);
		scanner.close();
	}
}
