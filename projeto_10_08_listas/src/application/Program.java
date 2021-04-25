package application;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Program {

	public static void main(String[] args) {
		
		List<String> names = new ArrayList<String>();
		String firstName;
		
		System.out.println("Name List");
		System.out.println("=========");
		
		System.out.println();
		System.out.println("Creating List:");
		names.add("Mary");
		names.add("Alex");
		names.add("Bob");
		names.add("Anna");
		printList(names);
		
		System.out.println();
		System.out.println("Updating position to with 'Marco':");
		names.add(2, "Marco");
		printList(names);
		
		System.out.println();
		System.out.println("Removing 'Anna' from list:");
		names.remove("Anna");
		printList(names);
		
		System.out.println();
		System.out.println("Removing second element from list:");
		names.remove(1);
		printList(names);
		
		System.out.println();
		System.out.println("Removing names that begin with the letter 'M' from list:");
		names.removeIf(name -> name.charAt(0) == 'M');
		printList(names);
		
		System.out.println();
		System.out.println("Recovering all names:");
		names.add("Mary");
		names.add("Alex");
		names.add("Anna");
		names.add("Marco");
		printList(names);
		
		System.out.println("The index of Bob is " + (names.indexOf("Bob") + 1));
		System.out.println("The index of Ronaldo is " + (names.indexOf("Ronaldo") + 1 + " (There isn't this name on list)"));
		
		System.out.println();
		System.out.println("Names that begin with the letter 'A':");
		printList(names.stream().filter(name -> name.charAt(0) == 'A').collect(Collectors.toList()));
		
		System.out.println();
		System.out.print("First name that begin with the letter 'A': ");
		firstName = names.stream().filter(name -> name.charAt(0) == 'A').findFirst().orElse(null);
		System.out.print(firstName);
	}
	
	private static void printList(List<String> list) {
		for (String item : list) {
			System.out.println("- " + item);
		}
	}
}
