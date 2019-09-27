package com.zhaku.lab3.P4;

import static java.lang.StrictMath.abs;

public class King extends Piece {

    @Override
    public boolean isLegalMove(Position a, Position b) {
        return abs(a.getY() - b.getY()) <= 1 && abs(a.getX() - b.getX()) <= 1;
    }

}
