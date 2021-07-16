package chess.pieces;

import boardgame.Board;
import boardgame.Position;
import chess.ChessPiece;
import chess.Color;

public class Queen extends ChessPiece {

	public Queen(Board board, Color color) {
		super(board, color);
	}
	
	@Override
	public boolean[][] possibleMoves() {
		
		Position testPosition = new Position(0, 0);
		boolean[][] possibleMoves = new boolean[getBoard().getRows()][getBoard().getColumns()];
		
		// Above
		testPosition.setValues(position.getRow() - 1, position.getColumn());
		while (getBoard().positionExists(testPosition) && !getBoard().thereIsAPiece(testPosition)) {
			possibleMoves[testPosition.getRow()][testPosition.getColumn()] = true;
			testPosition.setRow(testPosition.getRow() - 1);
		}
		if (getBoard().positionExists(testPosition) && isThereOpponentPiece(testPosition)) {
			possibleMoves[testPosition.getRow()][testPosition.getColumn()] = true;
		}
		
		// Left
		testPosition.setValues(position.getRow(), position.getColumn() - 1);
		while (getBoard().positionExists(testPosition) && !getBoard().thereIsAPiece(testPosition)) {
			possibleMoves[testPosition.getRow()][testPosition.getColumn()] = true;
			testPosition.setColumn(testPosition.getColumn() - 1);
		}
		if (getBoard().positionExists(testPosition) && isThereOpponentPiece(testPosition)) {
			possibleMoves[testPosition.getRow()][testPosition.getColumn()] = true;
		}
		
		// Right
		testPosition.setValues(position.getRow(), position.getColumn() + 1);
		while (getBoard().positionExists(testPosition) && !getBoard().thereIsAPiece(testPosition)) {
			possibleMoves[testPosition.getRow()][testPosition.getColumn()] = true;
			testPosition.setColumn(testPosition.getColumn() + 1);
		}
		if (getBoard().positionExists(testPosition) && isThereOpponentPiece(testPosition)) {
			possibleMoves[testPosition.getRow()][testPosition.getColumn()] = true;
		}
		
		// Below
		testPosition.setValues(position.getRow() + 1, position.getColumn());
		while (getBoard().positionExists(testPosition) && !getBoard().thereIsAPiece(testPosition)) {
			possibleMoves[testPosition.getRow()][testPosition.getColumn()] = true;
			testPosition.setRow(testPosition.getRow() + 1);
		}
		if (getBoard().positionExists(testPosition) && isThereOpponentPiece(testPosition)) {
			possibleMoves[testPosition.getRow()][testPosition.getColumn()] = true;
		}
		
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
		return "Q";
	}
}
