package chess;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import boardgame.Board;
import boardgame.Piece;
import boardgame.Position;
import chess.pieces.King;
import chess.pieces.Rook;

public class ChessMatch {
	
	private Board board;
	private Color currentPlayer;
	private boolean check;
	private int turn;
	
	private List<Piece> boardPieces = new ArrayList<>();
	private List<Piece> capturedPieces = new ArrayList<>();
	
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
	
	public boolean getCheck() {
		return check;
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
		
		if (testCheck(currentPlayer)) {
			undoMove(source, target, capturedPiece);
			throw new ChessException("Perform Move Error: You can't put yourself in check!");
		}
		check = testCheck(opponent(currentPlayer));
				
		nextTurn();
		return (ChessPiece) capturedPiece;
	}
	
	private void placeNewPiece(char column, int row, ChessPiece piece) {
		board.placePiece(piece, new ChessPosition(column, row).toPosition());
		boardPieces.add(piece);
	}
	
	private void initialSetup() {
		placeNewPiece('c', 1, new Rook(board, Color.WHITE));
		placeNewPiece('d', 1, new King(board, Color.WHITE));
		placeNewPiece('e', 1, new Rook(board, Color.WHITE));
		placeNewPiece('c', 2, new Rook(board, Color.WHITE));
		placeNewPiece('d', 2, new Rook(board, Color.WHITE));
		placeNewPiece('e', 2, new Rook(board, Color.WHITE));
		
		
		placeNewPiece('c', 7, new Rook(board, Color.BLACK));
		placeNewPiece('d', 7, new Rook(board, Color.BLACK));
		placeNewPiece('e', 7, new Rook(board, Color.BLACK));
		placeNewPiece('c', 8, new Rook(board, Color.BLACK));
		placeNewPiece('d', 8, new King(board, Color.BLACK));
		placeNewPiece('e', 8, new Rook(board, Color.BLACK));
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
		
		if (capturedPiece != null) {
			boardPieces.remove(capturedPiece);
			capturedPieces.add(capturedPiece);
		}
		
		return capturedPiece;
	}
	
	private void undoMove(Position source, Position target, Piece capturedPiece) {
		Piece movedPiece = board.removePiece(target);
		board.placePiece(movedPiece, source);
		
		if (capturedPiece != null) {
			board.placePiece(capturedPiece, target);
			capturedPieces.remove(capturedPiece);
			boardPieces.add(capturedPiece);
		}
	}
	
	private Color opponent(Color color) {
		return color == Color.WHITE ? Color.BLACK : Color.WHITE;
	}
	
	private ChessPiece king(Color color) {
		List<Piece> playerPieces = boardPieces.stream().filter(piece -> ((ChessPiece) piece).getColor() == color).collect(Collectors.toList());
		for (Piece piece : playerPieces) {
			if (piece instanceof King) {
				return (ChessPiece) piece;
			}
		}
		throw new IllegalStateException("Illegal State Error: There is no " + color.toString().toLowerCase() + " king on the board.");
	}
	
	private boolean testCheck(Color color) {
		List<Piece> opponentPieces = boardPieces.stream().filter(piece -> ((ChessPiece) piece).getColor() == opponent(color)).collect(Collectors.toList());
		Position kingPosition = king(color).getChessPosition().toPosition();
		
		for (Piece piece : opponentPieces) {
			boolean[][] possibleMoves = piece.possibleMoves();
			if (possibleMoves[kingPosition.getRow()][kingPosition.getColumn()]) {
				return true;
			}
		}
		return false;
	}
}
