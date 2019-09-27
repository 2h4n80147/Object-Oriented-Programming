package com.zhaku.lab3.P4;

public class Rook extends Piece {


    @Override
    public boolean isLegalMove(Position a, Position b) {
        return a.getX() == b.getX() || a.getY() == b.getY();
    }
}
