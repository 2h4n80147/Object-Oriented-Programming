package com.zhaku.lab3.P4;

public class Bishop extends Piece {

    public boolean isLegalMove(Position a, Position b) {
        return a.getX() + a.getY() == b.getX() + b.getY() || a.getX() - a.getY() == b.getX() - b.getY();
    }
}
