package chess.pieces;

import boardgame.Board;
import boardgame.Position;
import chess.ChessPiece;
import chess.Color;

public class Pawn extends ChessPiece {
	
	public Pawn(Board board, Color color) {
		super(board, color);
	}
	
	@Override
	public boolean[][] possibleMoves() {
		
		Position testPosition = new Position(0, 0);
		boolean[][] possibleMoves = new boolean[getBoard().getRows()][getBoard().getColumns()];
		
		if (getColor() == Color.WHITE) {
			
			Position testDoubledPosition = new Position(position.getRow() - 2, position.getColumn());
			testPosition.setValues(position.getRow() - 1, position.getColumn());
			
			if (getBoard().positionExists(testPosition) && !getBoard().thereIsAPiece(testPosition)) {
				possibleMoves[testPosition.getRow()][testPosition.getColumn()] = true;
			}
			
			if (getBoard().positionExists(testPosition) && !getBoard().thereIsAPiece(testPosition)
					&& getBoard().positionExists(testDoubledPosition) && !getBoard().thereIsAPiece(testDoubledPosition)
					&& getMoveCount() == 0) {
				possibleMoves[testDoubledPosition.getRow()][testDoubledPosition.getColumn()] = true;
			}
			
			testPosition.setValues(position.getRow() - 1, position.getColumn() - 1);
			if (getBoard().positionExists(testPosition) && isThereOpponentPiece(testPosition)) {
				possibleMoves[testPosition.getRow()][testPosition.getColumn()] = true;
			}
			
			testPosition.setValues(position.getRow() - 1, position.getColumn() + 1);
			if (getBoard().positionExists(testPosition) && isThereOpponentPiece(testPosition)) {
				possibleMoves[testPosition.getRow()][testPosition.getColumn()] = true;
			}
		} else {
			Position testDoubledPosition = new Position(position.getRow() + 2, position.getColumn());
			testPosition.setValues(position.getRow() + 1, position.getColumn());
			
			if (getBoard().positionExists(testPosition) && !getBoard().thereIsAPiece(testPosition)) {
				possibleMoves[testPosition.getRow()][testPosition.getColumn()] = true;
			}
			
			if (getBoard().positionExists(testPosition) && !getBoard().thereIsAPiece(testPosition)
					&& getBoard().positionExists(testDoubledPosition) && !getBoard().thereIsAPiece(testDoubledPosition)
					&& getMoveCount() == 0) {
				possibleMoves[testDoubledPosition.getRow()][testDoubledPosition.getColumn()] = true;
			}
			
			testPosition.setValues(position.getRow() + 1, position.getColumn() - 1);
			if (getBoard().positionExists(testPosition) && isThereOpponentPiece(testPosition)) {
				possibleMoves[testPosition.getRow()][testPosition.getColumn()] = true;
			}
			
			testPosition.setValues(position.getRow() + 1, position.getColumn() + 1);
			if (getBoard().positionExists(testPosition) && isThereOpponentPiece(testPosition)) {
				possibleMoves[testPosition.getRow()][testPosition.getColumn()] = true;
			}
		}
		
		return possibleMoves;
	}
	
	@Override
	public String toString() {
		return "P";
	}
}
