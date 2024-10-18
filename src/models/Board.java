package models;

public class Board {
    public Square[][] squares;

    public Board(){
        this.squares = new Square[8][8];
        for(int row=0; row<8; row++){
            for(int col=0; col<8; col++){
                Square square = new Square(row, col);
                this.squares[row][col] = square;
            }
        }

    }

    public void resetBoard(){
         // place black pawn on first and second rows
         for(int row=0; row<2; row++){
            for(int col=0; col<8; col++){
                Pawn blackPawn = new Pawn(Color.BLACK);
                this.squares[row][col].setPiece(blackPawn);
            }
        }

    }

    public void renderBoard(){
        // System.out.println("print board here!");
        for(int row=0; row<8; row++){
            for(int col=0; col<8; col++){
                // System.out.print(squares[row][col]);
                if (squares[row][col].getPiece() == null){
                    System.out.print("* ");
                }else{
                    System.out.print( squares[row][col].getPiece().type.toString().charAt(0) + " " );
                }
            }
            System.out.println("");
        }
    }

    public boolean isGameOver(){
        return false;
    }
}
