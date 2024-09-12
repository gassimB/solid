package dev.nouveautes.java17.sealed_class;

/**
 * Square peut être étendu
 */
non-sealed class Square extends Shape {

    private final int side;

    public Square(int side) {
        this.side = side;
    }

    @Override
    public double perimetre() {
        return side * side;
    }
}
