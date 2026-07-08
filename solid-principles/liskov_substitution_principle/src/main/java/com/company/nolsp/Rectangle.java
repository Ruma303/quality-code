package com.company.nolsp;

public class Rectangle {
    private int width;
    private int height;
    // ... getter/setter e costruttore
    public int computeArea() {
        return width * height;
    }
}

public class Square extends Rectangle {
    public Square(int side) {
        super(side, side);
    }

    @Override
    public void setWidth(int width) {
        setSide(width);
    }

    @Override
    public void setHeight(int height) {
        setSide(height);
    }

    public void setSide(int side) {
        super.setWidth(side);
        super.setHeight(side);
    }
}