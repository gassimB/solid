package dev.nouveautes.java17.sealed_class;

public final class Rectangle extends Shape {

    private final int width;
    private final int height;

    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }
    @Override
    public double perimetre() {
        return width * height;
    }
}
