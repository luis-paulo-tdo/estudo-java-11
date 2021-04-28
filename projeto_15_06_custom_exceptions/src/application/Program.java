package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner scanner = new Scanner(System.in);
		System.out.print("Room Number: ");
		System.out.print("Check-in date (dd/MM/yyyy): ");
		System.out.print("Check-out date (dd/MM/yyyy): ");
		
		System.out.println("Enter data to update the reservation:");
		System.out.println("Error in reservation: Check-out date must be after check-in date");
		System.out.println("Error in reservation: Reservation dates for update must be futures dates");
		scanner.close();
	}
}
