package models;

import java.util.ArrayList;

abstract class Piece{

    protected  Color color;
    protected  PieceType type;

    public Piece(Color color, PieceType type){
        this.color = color;
        this.type = type;
    }

    public abstract boolean isValidMove(Move move, Board board);
    public abstract ArrayList<Move> getAllValidMoves(Board board);

    
}