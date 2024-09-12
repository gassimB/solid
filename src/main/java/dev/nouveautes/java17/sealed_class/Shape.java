package dev.nouveautes.java17.sealed_class;

public sealed abstract class Shape permits Circle, Square, Rectangle {
    public abstract double perimetre();
}
