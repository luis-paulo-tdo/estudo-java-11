package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import model.entities.Reservation;

public class Program {
	
	public static void main(String[] args) throws ParseException {
		
		Locale.setDefault(Locale.US);
		Scanner scanner = new Scanner(System.in);
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
		
		Reservation reservation;
		Date checkIn, checkOut;
		int roomNumber;
		
		System.out.println("Reservation Manager");
		System.out.println("===================");
		System.out.println();
		
		System.out.print("Room Number: ");
		roomNumber = scanner.nextInt();
		
		System.out.print("Check-in date (dd/MM/yyyy): ");
		checkIn = simpleDateFormat.parse(scanner.next());
		
		System.out.print("Check-out date (dd/MM/yyyy): ");
		checkOut = simpleDateFormat.parse(scanner.next());
		
		if (!checkOut.after(checkIn)) {
			System.out.println("Error in reservation: Check-out date must be after check-in date");
		} else {
			
			reservation = new Reservation(roomNumber, checkIn, checkOut);
			String error;
			
			System.out.println(reservation);
			System.out.println();
			
			System.out.println("Enter data to update the reservation:");
			System.out.print("Check-in date (dd/MM/yyyy): ");
			checkIn = simpleDateFormat.parse(scanner.next());
			
			System.out.print("Check-out date (dd/MM/yyyy): ");
			checkOut = simpleDateFormat.parse(scanner.next());
			error = reservation.updateDates(checkIn, checkOut);
			
			if (error != null) {
				System.out.println(error);
			} else {
				System.out.println(reservation);
			}
		}
		
		scanner.close();
	}
}
