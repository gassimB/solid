package dev.nouveautes.java17.sealed_class;

/**
 * Circle est final, aucun objet ne peut hériter de Circle
 */
public final class Circle extends Shape {

    private final int rayon;

    public Circle(int rayon) {
        this.rayon = rayon;
    }

    @Override
    public double perimetre() {
        return rayon * rayon * Math.PI;
    }
}
