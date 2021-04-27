package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.Scanner;

import entities.Department;
import entities.HourContract;
import entities.Worker;
import entities.enums.WorkerLevel;

public class Program {

	public static void main(String[] args) throws ParseException {
		
		Locale.setDefault(Locale.US);
		Scanner scanner = new Scanner(System.in);
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
		
		Department department = new Department();
		Worker worker = new Worker();
		String monthAndYear;
		int contracts, month, year;
		
		System.out.println("Worker Info");
		System.out.println("=====================");
		System.out.println();
		
		System.out.print("Enter department name: ");
		department.setName(scanner.nextLine());
		
		System.out.println();
		System.out.println("Enter Woker Data");
		System.out.print("Name: ");
		worker.setName(scanner.nextLine());
		System.out.print("Level: ");
		worker.setLevel(WorkerLevel.valueOf(scanner.nextLine()));
		System.out.print("Base Salary: ");
		worker.setBaseSalary(scanner.nextDouble());
		worker.setDepartment(department);
		
		System.out.println("How many contracts to this worker?");
		System.out.print("> ");
		contracts = scanner.nextInt();
		
		
		for (int index = 1; index <= contracts; ++index) {
			
			HourContract contract = new HourContract();
			
			System.out.println();
			System.out.println("Enter contract #" + index + " data:");
			System.out.print("Date (DD/MM/YYYY): ");
			contract.setDate(simpleDateFormat.parse(scanner.next()));
			System.out.print("Value per Hour: ");
			contract.setValuePerHour(scanner.nextDouble());
			System.out.print("Duration (hours): ");
			contract.setHours(scanner.nextInt());
			
			worker.addContract(contract);
		}
		
		System.out.println();
		System.out.print("Enter month and year to calculate income (MM/YYYY): ");
		monthAndYear = scanner.next();
		month = Integer.parseInt(monthAndYear.substring(0, 2));
		year = Integer.parseInt(monthAndYear.substring(3));
		
		System.out.println("Name: " + worker.getName());
		System.out.println("Deparment: " + worker.getDepartment().getName());
		System.out.println("Income for " + monthAndYear + ": " + String.format("%.2f", worker.income(month, year)));
		
		scanner.close();
	}

}
