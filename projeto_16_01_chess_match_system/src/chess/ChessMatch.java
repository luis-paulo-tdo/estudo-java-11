package chess;

import boardgame.Board;
import boardgame.Piece;
import boardgame.Position;
import chess.pieces.King;
import chess.pieces.Rook;

public class ChessMatch {
	
	private Board board;
	private Color currentPlayer;
	private int turn;
	
	public ChessMatch() {
		board = new Board(8, 8);
		currentPlayer = Color.WHITE;
		turn = 1;
		initialSetup();
	}
	
	public int getTurn() {
		return turn;
	}

	public Color getCurrentPlayer() {
		return currentPlayer;
	}
	
	public ChessPiece[][] getPieces() {
		ChessPiece[][] chessPieces = new ChessPiece[board.getRows()][board.getColumns()];
		for (int row = 0; row < board.getRows(); ++row) {
			for (int column = 0; column < board.getColumns(); ++column) {
				chessPieces[row][column] = (ChessPiece) board.piece(row, column);
			}
		}
		return chessPieces;
	}
	
	public boolean[][] possibleMoves(ChessPosition source) {
		Position position = source.toPosition();
		validateSourcePosition(position);
		return board.piece(position).possibleMoves();
	}
	
	public ChessPiece performChessMove(ChessPosition sourcePosition, ChessPosition targetPosition) {
		Position source = sourcePosition.toPosition();
		Position target = targetPosition.toPosition();
		Piece capturedPiece;
		
		validateSourcePosition(source);
		validateTargetPosition(source, target);
		capturedPiece = makeMove(source, target);
		
		nextTurn();
		return (ChessPiece) capturedPiece;
	}
	
	private void placeNewPiece(char column, int row, ChessPiece piece) {
		board.placePiece(piece, new ChessPosition(column, row).toPosition());
	}
	
	private void initialSetup() {
		placeNewPiece('a', 8, new Rook(board, Color.WHITE));
		placeNewPiece('e', 8, new King(board, Color.WHITE));
		placeNewPiece('e', 1, new King(board, Color.BLACK));
	}
	
	private void nextTurn() {
		turn++;
		currentPlayer = currentPlayer == Color.WHITE ? Color.BLACK : Color.WHITE;
	}
	
	private void validateSourcePosition(Position position) {
		if (!board.thereIsAPiece(position)) {
			throw new ChessException("Move Perform Error: There is no piece on source position!");
		}
		
		if (currentPlayer != ((ChessPiece) board.piece(position)).getColor()) {
			throw new ChessException("Move Perform Error: The chosen piece is not yours!");
		}
		
		if (!board.piece(position).isThereAnyPossibleMove()) {
			throw new ChessException("Move Perform Error: There is no possible moves for the chosen piece!");
		}
	}
	
	private void validateTargetPosition(Position source, Position target) {
		if (!board.piece(source).possibleMove(target)) {
			throw new ChessException("Move Perform Error: The chosen piece can't move to target position!");
		}
	}
	
	private Piece makeMove(Position source, Position target) {
		Piece movedPiece = board.removePiece(source);
		Piece capturedPiece = board.removePiece(target);
		board.placePiece(movedPiece, target);
		return capturedPiece;
	}
}
