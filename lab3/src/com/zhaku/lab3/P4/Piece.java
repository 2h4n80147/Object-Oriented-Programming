package com.zhaku.lab3.P4;


import javafx.geometry.Pos;

public abstract class Piece {
    Position pos;
    Piece() {}
    Piece(Position pos) {
        this.pos = pos;
    }

    public  abstract boolean isLegalMove(Position a, Position b);

}
