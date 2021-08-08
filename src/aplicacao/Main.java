package aplicacao;

import java.util.InputMismatchException;
import java.util.Scanner;

import chess.ChessException;
import chess.ChessMatch;
import chess.ChessPiece;
import chess.ChessPosition;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ChessMatch match = new ChessMatch();
		
		while(true) {
			try {
				UI.clearScreen();
				UI.printBoard(match.getPieces());
				System.out.println();
				System.out.println("Posi��o de origem: ");
				ChessPosition source = UI.readChessPosition(sc);
				
				boolean [][] possibleMoves = match.possibleMoves(source); 
				UI.clearScreen();
				UI.printBoard(match.getPieces(), possibleMoves);
				
				System.out.println("Posi��o de destino: ");
				ChessPosition target = UI.readChessPosition(sc);
				ChessPiece capturedPiece = match.performChessMovie(source, target);
			}
			catch(ChessException e) {
				System.out.println(e.getMessage());
				sc.nextLine();
			}
			catch(InputMismatchException e) {
				System.out.println(e.getMessage());
				sc.nextLine();
			}
			

		}
		
	}

}
