package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

public class Program {

	public static void main(String[] args) throws ParseException {
		
		Calendar calendar = Calendar.getInstance();
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyy HH:mm:ss");
		Date date = Date.from(Instant.parse("2021-04-25T09:24:10Z"));
		int month, minutes;
		
		calendar.setTime(date);
		System.out.println("Sample Date: " + simpleDateFormat.format(date));
		System.out.println();
		
		calendar.add(Calendar.HOUR_OF_DAY, 4);
		date = calendar.getTime();
		System.out.println("Added 4 hours...");
		System.out.println("Result: " + simpleDateFormat.format(date));
		System.out.println();

		month = 1 + calendar.get(Calendar.MONTH);
		minutes = calendar.get(Calendar.MINUTE);

		System.out.println("Month: " + month);
		System.out.println("Minutes: " + minutes);
		System.out.println();
		
		useDate();
	}
	
	private static void useDate() throws ParseException {
		
		SimpleDateFormat simpleDateFormatOne = new SimpleDateFormat("dd/MM/yyy");
		SimpleDateFormat simpleDateFormatTwo = new SimpleDateFormat("dd/MM/yyy HH:mm:ss");
		SimpleDateFormat simpleDateFormatThree = new SimpleDateFormat("dd/MM/yyy HH:mm:ss");
		simpleDateFormatThree.setTimeZone(TimeZone.getTimeZone("GMT"));
		
		Date dateOne = simpleDateFormatOne.parse("25/04/2021");
		Date dateTwo = simpleDateFormatTwo.parse("25/04/2021 08:54:45");
		
		Date currentDateOne = new Date();
		Date currentDateTwo = new Date(System.currentTimeMillis());
		
		Date instantZero = new Date(0L);
		Date hourFive = new Date(1000L * 60 * 60 * 5);
		
		Date iso8601Date = Date.from(Instant.parse("2021-04-25T09:05:25Z"));
		
		System.out.println("Dates on BRT");
		System.out.println("===================================");
		System.out.println("Date One:\t\t" + simpleDateFormatTwo.format(dateOne));
		System.out.println("Date Two:\t\t" + simpleDateFormatTwo.format(dateTwo));
		System.out.println("Current Date One:\t" + simpleDateFormatTwo.format(currentDateOne));
		System.out.println("Current Date Two:\t" + simpleDateFormatTwo.format(currentDateTwo));
		System.out.println("Instant Zero:\t\t" + simpleDateFormatTwo.format(instantZero));
		System.out.println("Hour Five:\t\t" + simpleDateFormatTwo.format(hourFive));
		System.out.println("Hour Five:\t\t" + simpleDateFormatTwo.format(iso8601Date));
		
		System.out.println();
		System.out.println("Dates on UTC");
		System.out.println("===================================");
		System.out.println("Date One:\t\t" + simpleDateFormatThree.format(dateOne));
		System.out.println("Date Two:\t\t" + simpleDateFormatThree.format(dateTwo));
		System.out.println("Current Date One:\t" + simpleDateFormatThree.format(currentDateOne));
		System.out.println("Current Date Two:\t" + simpleDateFormatThree.format(currentDateTwo));
		System.out.println("Instant Zero:\t\t" + simpleDateFormatThree.format(instantZero));
		System.out.println("Hour Five:\t\t" + simpleDateFormatThree.format(hourFive));
		System.out.println("Hour Five:\t\t" + simpleDateFormatThree.format(iso8601Date));
		
		System.out.println();
		System.out.println("Raw Dates");
		System.out.println("===================================");
		System.out.println("Date One:\t\t" + dateOne);
		System.out.println("Date Two:\t\t" + dateTwo);
		System.out.println("Current Date One:\t" + currentDateOne);
		System.out.println("Current Date Two:\t" + currentDateTwo);
		System.out.println("Instant Zero:\t\t" + instantZero);
		System.out.println("Hour Five:\t\t" + hourFive);
		System.out.println("Hour Five:\t\t" + iso8601Date);
	}
}
