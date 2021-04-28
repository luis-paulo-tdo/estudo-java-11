package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Employee;
import entities.OutsourcedEmployee;

public class Program {
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner scanner = new Scanner(System.in);
		List<Employee> employees = new ArrayList<Employee>();
		int employeeQuantity;
		
		System.out.println("Employee Payments");
		System.out.println("=====================");
		System.out.println();
	
		System.out.print("Enter the number of employees: ");
		employeeQuantity = scanner.nextInt();
		System.out.println();
		
		for (int index = 1; index <= employeeQuantity; ++index) {
			
			String name;
			double valuePerHour;
			char isOutsourced;
			int hours;
			
			System.out.println("Employee #" + index + " data");
			System.out.print("Outsourced? (y/n) ");
			isOutsourced = scanner.next().charAt(0);
			
			System.out.print("Name: ");
			scanner.nextLine();
			name = scanner.nextLine();
			
			System.out.print("Hours: ");
			hours = scanner.nextInt();
			
			System.out.print("Value per Hour: ");
			valuePerHour = scanner.nextDouble();
			
			if (isOutsourced == 'y') {
				double additionalCharge;
				System.out.print("Addicional Charge: ");
				additionalCharge = scanner.nextDouble();
				employees.add(new OutsourcedEmployee(name, hours, valuePerHour, additionalCharge));
			} else {
				employees.add(new Employee(name, hours, valuePerHour));
			}
		}
		
		System.out.println("PAYMENTS");
		for (Employee employee : employees) {
			System.out.println(employee.getName() + " - $" + String.format("%.2f", employee.payment()));
		}
		
		scanner.close();
	}
}
