package application;

import boardgame.Board;
import boardgame.Position;

public class Program {

	public static void main(String[] args) {
		
		Board board = new Board(8, 8);
		Position position = new Position(3, 5);
		
		System.out.println("Welcome To The Chess Match!");
		System.out.println();
		System.out.println("Board Size: [" + board.getRows() + ", " + board.getColumns() + "]");
		System.out.println("Current Position: " + position);
	}

}
