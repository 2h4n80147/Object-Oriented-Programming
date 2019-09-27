package com.zhaku.lab3.P4;

import static java.lang.Math.abs;

public class Knight extends Piece {


    @Override
    public boolean isLegalMove(Position a, Position b) {
        return (abs(a.getY() - b.getY()) + abs(a.getX() - b.getX()) == 3);
    }
}
