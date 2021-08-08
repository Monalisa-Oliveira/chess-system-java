package aplicacao;

import java.util.Scanner;

import chess.ChessMatch;
import chess.ChessPiece;
import chess.ChessPosition;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ChessMatch match = new ChessMatch();
		
		while(true) {
			UI.printBoard(match.getPieces());
			System.out.println();
			System.out.println("Posição de origem: ");
			ChessPosition source = UI.readChessPosition(sc);
			System.out.println("Posição de destino: ");
			ChessPosition target = UI.readChessPosition(sc);
			ChessPiece capturedPiece = match.performChessMovie(source, target);

		}
		
	}

}
