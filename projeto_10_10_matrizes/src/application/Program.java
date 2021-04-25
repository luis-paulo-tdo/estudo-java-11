package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {
	
public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner scanner = new Scanner(System.in);
		int negativeCount = 0;
		int size;
		
		System.out.println("Matrix Creator");
		System.out.println("======================");
		
		System.out.println("Enter the matrix size:");
		System.out.print("> ");
		size = scanner.nextInt();
		int[][] matrix = new int[size][size];
		
		for (int row = 0; row < matrix.length; ++row) {
			for (int column = 0; column < matrix[row].length; ++column) {
				System.out.print("Enter [" + (row + 1) + ":" + (column + 1) + "]: ");
				matrix[row][column] = scanner.nextInt();
			}
		}
		
		System.out.println();
		System.out.print("Matrix created!");
		for (int row = 0; row < matrix.length; ++row) {
			System.out.println();
			for (int column = 0; column < matrix[row].length; ++column) {
				System.out.print(matrix[row][column] + "\t");
			}
		}
		
		System.out.println();
		System.out.println();
		System.out.print("Main Diagonal:\t");
		for (int row = 0; row < matrix.length; ++row) {
			System.out.print("\t" + matrix[row][row]);
		}
		
		System.out.println();
		for (int row = 0; row < matrix.length; ++row) {
			for (int column = 0; column < matrix[row].length; ++column) {
				if (matrix[row][column] < 0) {
					negativeCount++;
				}
			}
		}
		System.out.print("Negative Numbers Count:\t" + negativeCount);
		
		scanner.close();
	}
}
