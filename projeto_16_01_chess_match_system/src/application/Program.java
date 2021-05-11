package application;

import java.util.Scanner;

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
			UserInterface.printBoard(chessMatch.getPieces());
			
			System.out.println();
			System.out.print("Source: ");
			ChessPosition source = UserInterface.readChessPosition(scanner);
			
			System.out.println();
			System.out.print("Target: ");
			ChessPosition target = UserInterface.readChessPosition(scanner);
			ChessPiece capturedPiece = chessMatch.performChessMove(source, target);
		}
	}

}
