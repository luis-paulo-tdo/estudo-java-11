import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		System.out.println("Type a chapter and a text with three paragraphs:");
		int chapter;
		String paragraphOne, paragraphTwo, paragraphThree;
		Scanner scanner = new Scanner(System.in);
		
		chapter = scanner.nextInt();
		scanner.nextLine();
		
		paragraphOne = scanner.nextLine();
		paragraphTwo = scanner.nextLine();
		paragraphThree = scanner.nextLine();
		
		System.out.println();
		System.out.printf("Chapter %d:\n", chapter);
		System.out.println(paragraphOne);
		System.out.println(paragraphTwo);
		System.out.println(paragraphThree);
		scanner.close();
	}
}
