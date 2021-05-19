package chess.pieces;

import boardgame.Board;
import boardgame.Position;
import chess.ChessPiece;
import chess.Color;

public class King extends ChessPiece {

	public King(Board board, Color color) {
		super(board, color);
	}

	@Override
	public boolean[][] possibleMoves() {
		Position testPosition = new Position(0, 0);
		boolean[][] possibleMoves = new boolean[getBoard().getRows()][getBoard().getColumns()];
		
		// Above
		testPosition.setValues(position.getRow() - 1, position.getColumn());
		if (getBoard().positionExists(testPosition) && canMove(testPosition)) {
			possibleMoves[testPosition.getRow()][testPosition.getColumn()] = true;
		}
		
		// Left
		testPosition.setValues(position.getRow(), position.getColumn() - 1);
		if (getBoard().positionExists(testPosition) && canMove(testPosition)) {
			possibleMoves[testPosition.getRow()][testPosition.getColumn()] = true;
		}
		
		// Right
		testPosition.setValues(position.getRow(), position.getColumn() + 1);
		if (getBoard().positionExists(testPosition) && canMove(testPosition)) {
			possibleMoves[testPosition.getRow()][testPosition.getColumn()] = true;
		}
		
		// Below
		testPosition.setValues(position.getRow() + 1, position.getColumn());
		if (getBoard().positionExists(testPosition) && canMove(testPosition)) {
			possibleMoves[testPosition.getRow()][testPosition.getColumn()] = true;
		}
		
		// North West
		testPosition.setValues(position.getRow() - 1, position.getColumn() - 1);
		if (getBoard().positionExists(testPosition) && canMove(testPosition)) {
			possibleMoves[testPosition.getRow()][testPosition.getColumn()] = true;
		}
		
		// North East
		testPosition.setValues(position.getRow() - 1, position.getColumn() + 1);
		if (getBoard().positionExists(testPosition) && canMove(testPosition)) {
			possibleMoves[testPosition.getRow()][testPosition.getColumn()] = true;
		}
		
		// South West
		testPosition.setValues(position.getRow() + 1, position.getColumn() - 1);
		if (getBoard().positionExists(testPosition) && canMove(testPosition)) {
			possibleMoves[testPosition.getRow()][testPosition.getColumn()] = true;
		}
		
		// South East
		testPosition.setValues(position.getRow() + 1, position.getColumn() + 1);
		if (getBoard().positionExists(testPosition) && canMove(testPosition)) {
			possibleMoves[testPosition.getRow()][testPosition.getColumn()] = true;
		}
		
		return possibleMoves;
	}
	
	@Override
	public String toString() {
		return "K";
	}
	
	private boolean canMove(Position position) {
		ChessPiece piece = (ChessPiece) getBoard().piece(position);
		return piece == null || piece.getColor() != getColor();
	}
}
