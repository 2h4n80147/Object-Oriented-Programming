package com.zhaku.lab3.P4;

public class Test {
    public static void main(String[] args) {
        Position p1=new Position('d',4);
        Position p2=new Position('e',5);
        King king=new King();
        Queen queen=new Queen();
        Rook rook=new Rook();
        Bishop bishop=new Bishop();
        Knight knight=new Knight();
        System.out.println(king.isLegalMove(p1,p2));
        System.out.println(queen.isLegalMove(p1,p2));
        System.out.println(rook.isLegalMove(p1,p2));
        System.out.println(bishop.isLegalMove(p1,p2));
        System.out.println(knight.isLegalMove(p1,p2));
    }
}
