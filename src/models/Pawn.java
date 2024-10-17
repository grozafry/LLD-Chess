package models;

import java.util.ArrayList;

public class Pawn extends Piece {

    public Pawn(Color color){
        super(color, PieceType.PAWN);
    }

    public boolean isValidMove(Move move, Board board){
        return true;
    }
    public ArrayList<Move> getAllValidMoves(Board board){
        return new ArrayList<Move>();
    }
}
