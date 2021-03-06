package application;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

import chess.ChessMatch;
import chess.ChessPiece;
import chess.ChessPosition;
import chess.Color;

public class UserInterface {
	
	public static final String ANSI_RESET = "\u001B[0m";
	public static final String ANSI_BLACK = "\u001B[30m";
	public static final String ANSI_RED = "\u001B[31m";
	public static final String ANSI_GREEN = "\u001B[32m";
	public static final String ANSI_YELLOW = "\u001B[33m";
	public static final String ANSI_BLUE = "\u001B[34m";
	public static final String ANSI_PURPLE = "\u001B[35m";
	public static final String ANSI_CYAN = "\u001B[36m";
	public static final String ANSI_WHITE = "\u001B[37m";

	public static final String ANSI_BLACK_BACKGROUND = "\u001B[40m";
	public static final String ANSI_RED_BACKGROUND = "\u001B[41m";
	public static final String ANSI_GREEN_BACKGROUND = "\u001B[42m";
	public static final String ANSI_YELLOW_BACKGROUND = "\u001B[43m";
	public static final String ANSI_BLUE_BACKGROUND = "\u001B[44m";
	public static final String ANSI_PURPLE_BACKGROUND = "\u001B[45m";
	public static final String ANSI_CYAN_BACKGROUND = "\u001B[46m";
	public static final String ANSI_WHITE_BACKGROUND = "\u001B[47m";

	public static ChessPosition readChessPosition(Scanner scanner) {
		
		try {
			String position = scanner.nextLine();
			int row = Integer.parseInt(position.substring(1));
			char column = position.charAt(0);
			
			return new ChessPosition(column, row);
		} catch(Exception exception) {
			throw new InputMismatchException("Reading ChessPosition Exception: Valid values are from a1 to h8.");
		}
	}

	public static void printBoard(ChessPiece[][] pieces) {
		for (int row = 0; row < pieces.length; ++row) {
			System.out.print((8 - row) + " ");
			for (int column = 0; column < pieces[row].length; ++column) {
				printPiece(pieces[row][column], false);
			}
			System.out.println();
		}
		System.out.println("  a b c d e f g h");
	}
	
	public static void printMatch(ChessMatch match, List<ChessPiece> capturedPieces) {
		printBoard(match.getPieces());
		System.out.println();
		
		printCapturedPieces(capturedPieces);
		System.out.println();
		System.out.println("Turn: " + match.getTurn());
		
		if (!match.getCheckMate()) {
			System.out.println("Waiting Player: " + match.getCurrentPlayer());
			if (match.getCheck()) {
				System.out.print(ANSI_RED);
				System.out.println("Check!");
				System.out.print(ANSI_RESET);
			}
		} else {
			System.out.println(ANSI_RED);
			System.out.print("CHECKMATE!");
			System.out.print(ANSI_RESET);
			System.out.println(ANSI_GREEN);
			System.out.print("Winner: " + match.getCurrentPlayer());
			System.out.println(ANSI_RESET);
		}
		
	}
	
	public static void printBoard(ChessPiece[][] pieces, boolean[][] possibleMoves) {
		for (int row = 0; row < pieces.length; ++row) {
			System.out.print((8 - row) + " ");
			for (int column = 0; column < pieces[row].length; ++column) {
				printPiece(pieces[row][column], possibleMoves[row][column]);
			}
			System.out.println();
		}
		System.out.println("  a b c d e f g h");
	}
	
	private static void printPiece(ChessPiece piece, boolean background) {
		
		if (background) {
			System.out.print(ANSI_BLUE_BACKGROUND);
		}
		
		if (piece == null) {
			System.out.print("-" + ANSI_RESET);
		} else {
			if (piece.getColor() == Color.WHITE) {
				System.out.print(ANSI_WHITE + piece + ANSI_RESET);
			} else {
				System.out.print(ANSI_YELLOW + piece + ANSI_RESET);
			}
		}
		System.out.print(" ");
	}
	
	private static void printCapturedPieces(List<ChessPiece> capturedPieces) {
		List<ChessPiece> whitePieces = capturedPieces.stream().filter(piece -> piece.getColor() == Color.WHITE).collect(Collectors.toList());
		List<ChessPiece> blackPieces = capturedPieces.stream().filter(piece -> piece.getColor() == Color.BLACK).collect(Collectors.toList());
		
		System.out.println("[Captured Pieces]");
		System.out.print("White: ");
		System.out.print(ANSI_WHITE);
		System.out.print(Arrays.toString(whitePieces.toArray()));
		System.out.println(ANSI_RESET);
		System.out.print("Black: ");
		System.out.print(ANSI_YELLOW);
		System.out.print(Arrays.toString(blackPieces.toArray()));
		System.out.println(ANSI_RESET);
	}
	
	public static void clearScreen() {
		System.out.print("\033[H\033[2J");
		System.out.flush();
	}
}
