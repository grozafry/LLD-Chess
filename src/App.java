
import java.util.Scanner;
import models.Board;
import models.Color;
import models.Move;
import models.Piece;

public class App {
    public static void main(String[] args) {

        System.out.println("Welcome to Chess!\n");
        
        System.out.println("Initializing chess board...");

        Board board = new Board();
        board.resetBoard();

        Color toPlay = Color.WHITE;

        Scanner scanner = new Scanner(System.in);

        while(true){
            
            board.renderBoard();

            if(!board.isGameOver()){

                System.out.println("To play: " + toPlay);

                // take user move and process
                int rowFrom = scanner.nextInt();
                int colFrom = scanner.nextInt();
                int rowTo = scanner.nextInt();
                int colTo = scanner.nextInt();
                
                Move userMove = new Move( rowFrom, colFrom, rowTo, colTo );
                if (userMove.isValidMove(board) ){
                    // Capture piece at To location

                    //

                    Piece piece = board.squares[rowFrom][colFrom].getPiece();
                    board.squares[rowTo][colTo].setPiece(piece);
                    board.squares[rowFrom][colFrom].setPiece(null);


                }else{
                    System.err.println("Invalid Move! Please make a valid move!");
                }
                //

                switch (toPlay) {
                    case Color.WHITE:
                        toPlay = Color.BLACK;
                        break;
                    case Color.BLACK:
                        toPlay = Color.WHITE;
                        break;
                }
            }else{
                break;
            }


        }
            
        System.out.println("Game Over!!");
        



    }
}

