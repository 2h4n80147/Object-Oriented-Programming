package com.zhaku.lab3.P4;

import javafx.geometry.Pos;

public class Position {
    private int x;
    private int y;

    public Position (char column, int row ) {
        x = column - 'a';
        y = row - 1;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }
}
