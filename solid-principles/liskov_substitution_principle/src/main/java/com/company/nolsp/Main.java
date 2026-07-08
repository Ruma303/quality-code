package com.company.nolsp;

public class Main {
    static void main() {
        Rectangle rectangle = new Rectangle();
        useRectangle(rectangle);

    }
    private static void useRectangle(Rectangle rectangle) {
        rectangle.setHeight(20);
        rectangle.setWidth(30);
        assert rectangle.getHeight() == 20 : "Height Not equal to 20";
        assert rectangle.getWidth() == 30 : "Width Not equal to 30";
    }
}
