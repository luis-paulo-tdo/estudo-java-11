package boardgame;

public abstract class Piece {
	
	protected Position position;
	private Board board;
	
	public Piece(Board board) {
		this.board = board;
	}

	protected Board getBoard() {
		return board;
	}
	
	public abstract boolean[][] possibleMoves();
	
	public boolean possibleMove(Position position) {
		return possibleMoves()[position.getRow()][position.getColumn()];
	}
	
	public boolean isThereAnyPossibleMove() {
		boolean[][] possibleMoves = possibleMoves();
		
		for (int row = 0; row < possibleMoves.length; ++row) {
			for (int column = 0; column < possibleMoves.length; ++column) {
				if (possibleMoves[row][column]) {
					return true;
				}
			}
		}
		return false;
	}
}
