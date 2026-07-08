package com.company.lsp;

public class Main {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(10, 20);
        System.out.println(rectangle.computeArea()); // 200

        Square square = new Square(10);
        System.out.println(square.computeArea()); // 100

        // Testare rectangle
        rectangle.setHeight(20);
        rectangle.setWidth(30);
        // rectangle.getHeight() == 20, rectangle.getWidth() == 30

        // Testare square
        square.setSide(15);
        // square.getSide() == 15
    }
}
