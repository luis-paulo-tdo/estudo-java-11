package application;

import java.util.InputMismatchException;
import java.util.Scanner;

import chess.ChessException;
import chess.ChessMatch;
import chess.ChessPiece;
import chess.ChessPosition;

public class Program {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		ChessMatch chessMatch = new ChessMatch();
		
		System.out.println("Welcome To The Chess Match!");
		System.out.println();
		
		while (true) {
			try {
				UserInterface.clearScreen();
				UserInterface.printBoard(chessMatch.getPieces());
				
				System.out.println();
				System.out.print("Source: ");
				ChessPosition source = UserInterface.readChessPosition(scanner);
				boolean[][] possibleMoves = chessMatch.possibleMoves(source);
				
				UserInterface.clearScreen();
				UserInterface.printBoard(chessMatch.getPieces(), possibleMoves);
				
				System.out.println();
				System.out.print("Target: ");
				ChessPosition target = UserInterface.readChessPosition(scanner);
				ChessPiece capturedPiece = chessMatch.performChessMove(source, target);
				
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
