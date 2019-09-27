package com.zhaku.lab3.P4;

import javafx.util.Pair;

public class Pawn extends Piece {


    @Override
    public boolean isLegalMove(Position a, Position b) {
        return (a.getY() + 1 == b.getY());
    }
}
