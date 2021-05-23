package application;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

import chess.ChessException;
import chess.ChessMatch;
import chess.ChessPiece;
import chess.ChessPosition;

public class Program {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		ChessMatch match = new ChessMatch();
		List<ChessPiece> capturedPieces = new ArrayList<>();
		
		System.out.println("Welcome To The Chess Match!");
		System.out.println();
		
		while (true) {
			try {
				UserInterface.clearScreen();
				UserInterface.printMatch(match, capturedPieces);
				
				System.out.println();
				System.out.print("Source: ");
				ChessPosition source = UserInterface.readChessPosition(scanner);
				boolean[][] possibleMoves = match.possibleMoves(source);
				
				UserInterface.clearScreen();
				UserInterface.printBoard(match.getPieces(), possibleMoves);
				
				System.out.println();
				System.out.print("Target: ");
				ChessPosition target = UserInterface.readChessPosition(scanner);
				
				ChessPiece capturedPiece = match.performChessMove(source, target);
				if (capturedPiece != null) {
					capturedPieces.add(capturedPiece);
				}
				
			} catch (ChessException exception) {
				System.out.println(exception.getMessage());
				scanner.nextLine();
			} catch (InputMismatchException exception) {
				System.out.println(exception.getMessage());
				scanner.nextLine();
			}
		}
	}

}
