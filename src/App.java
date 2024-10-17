
import models.Board;
import models.Color;

public class App {
    public static void main(String[] args) {
        System.out.println("Welcome to Chess!\n");
        
        System.out.println("Initializing chess board...");

        Board board = new Board();
        board.resetBoard();

        Color toPlay = Color.WHITE;

        while(true){
            
            board.renderBoard();

            if(!board.isGameOver()){

                System.out.println("To play: " + toPlay);

                // take user move and process

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