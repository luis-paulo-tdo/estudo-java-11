package chess.pieces;

import boardgame.Board;
import boardgame.Position;
import chess.ChessPiece;
import chess.Color;

public class Bishop extends ChessPiece {
	
	public Bishop(Board board, Color color) {
		super(board, color);
	}
	
	@Override
	public boolean[][] possibleMoves() {
		
		Position testPosition = new Position(0, 0);
		boolean[][] possibleMoves = new boolean[getBoard().getRows()][getBoard().getColumns()];
		
		// North West
		testPosition.setValues(position.getRow() - 1, position.getColumn() - 1);
		while (getBoard().positionExists(testPosition) && !getBoard().thereIsAPiece(testPosition)) {
			possibleMoves[testPosition.getRow()][testPosition.getColumn()] = true;
			testPosition.setValues(testPosition.getRow() - 1, testPosition.getColumn() - 1);
		}
		if (getBoard().positionExists(testPosition) && isThereOpponentPiece(testPosition)) {
			possibleMoves[testPosition.getRow()][testPosition.getColumn()] = true;
		}
		
		// North East
		testPosition.setValues(position.getRow() - 1, position.getColumn() + 1);
		while (getBoard().positionExists(testPosition) && !getBoard().thereIsAPiece(testPosition)) {
			possibleMoves[testPosition.getRow()][testPosition.getColumn()] = true;
			testPosition.setValues(testPosition.getRow() - 1, testPosition.getColumn() + 1);
		}
		if (getBoard().positionExists(testPosition) && isThereOpponentPiece(testPosition)) {
			possibleMoves[testPosition.getRow()][testPosition.getColumn()] = true;
		}
		
		// South East
		testPosition.setValues(position.getRow() + 1, position.getColumn() + 1);
		while (getBoard().positionExists(testPosition) && !getBoard().thereIsAPiece(testPosition)) {
			possibleMoves[testPosition.getRow()][testPosition.getColumn()] = true;
			testPosition.setValues(testPosition.getRow() + 1, testPosition.getColumn() + 1);
		}
		if (getBoard().positionExists(testPosition) && isThereOpponentPiece(testPosition)) {
			possibleMoves[testPosition.getRow()][testPosition.getColumn()] = true;
		}
		
		// South West
		testPosition.setValues(position.getRow() + 1, position.getColumn() - 1);
		while (getBoard().positionExists(testPosition) && !getBoard().thereIsAPiece(testPosition)) {
			possibleMoves[testPosition.getRow()][testPosition.getColumn()] = true;
			testPosition.setValues(testPosition.getRow() + 1, testPosition.getColumn() - 1);
		}
		if (getBoard().positionExists(testPosition) && isThereOpponentPiece(testPosition)) {
			possibleMoves[testPosition.getRow()][testPosition.getColumn()] = true;
		}
		
		return possibleMoves;
	}
	
	@Override
	public String toString() {
		return "B";
	}
}
