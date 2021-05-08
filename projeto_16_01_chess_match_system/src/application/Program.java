package application;

import chess.ChessMatch;

public class Program {

	public static void main(String[] args) {
		
		ChessMatch chessMatch = new ChessMatch();
		
		System.out.println("Welcome To The Chess Match!");
		System.out.println();
		UserInterface.printBoard(chessMatch.getPieces());
	}

}
