package models;

public class Move {
    private int fromRow;
    private int fromCol;
    private int toRow;
    private int toCol;

    public Move(int fromRow, int fromCol, int toRow, int toCol){
        this.fromRow = fromRow;
        this.fromCol = fromCol;
        this.toRow = toRow;
        this.toCol = toCol;
    }

    public boolean isValidMove(Board board){
        return true;
    }
}
