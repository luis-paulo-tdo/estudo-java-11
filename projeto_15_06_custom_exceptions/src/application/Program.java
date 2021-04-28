package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import model.entities.Reservation;
import model.exceptions.DomainException;

public class Program {
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner scanner = new Scanner(System.in);
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
		
		Reservation reservation;
		Date checkIn, checkOut;
		int roomNumber;
		
		System.out.println("Reservation Manager");
		System.out.println("===================");
		System.out.println();
		
		try {
			System.out.print("Room Number: ");
			roomNumber = scanner.nextInt();
			
			System.out.print("Check-in date (dd/MM/yyyy): ");
			checkIn = simpleDateFormat.parse(scanner.next());
			
			System.out.print("Check-out date (dd/MM/yyyy): ");
			checkOut = simpleDateFormat.parse(scanner.next());
			
			reservation = new Reservation(roomNumber, checkIn, checkOut);
			System.out.println("Reservation: " + reservation);
			
			System.out.println();
			System.out.println("Enter data to update the reservation:");
			
			System.out.print("Check-in date (dd/MM/yyyy): ");
			checkIn = simpleDateFormat.parse(scanner.next());
			
			System.out.print("Check-out date (dd/MM/yyyy): ");
			checkOut = simpleDateFormat.parse(scanner.next());
			
			reservation.updateDates(checkIn, checkOut);
			System.out.println("Reservation: " + reservation);
		}
		catch (ParseException exception) {
			System.out.println("Parse Date Error: Invalid date format!");
		}
		catch (DomainException exception) {
			System.out.println("Reservation Error: " + exception.getMessage());
		}
		catch (RuntimeException exception) {
			System.out.println("Runtime Error: Unexpected Error!");
		}
		finally {
			scanner.close();
		}
	}
}
