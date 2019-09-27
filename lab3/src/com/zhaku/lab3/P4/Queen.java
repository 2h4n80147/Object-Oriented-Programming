package com.zhaku.lab3.P4;

public class Queen extends Bishop {

    @Override
    public boolean isLegalMove(Position a, Position b) {
        return super.isLegalMove(a, b) || a.getX() == b.getX() || a.getY() == b.getY();
    }

}
