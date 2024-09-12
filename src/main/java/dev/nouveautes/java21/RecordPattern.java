package dev.nouveautes.java21;

import dev.nouveautes.java21.record.*;

public class RecordPattern {

    // Record Patterns
    public static void printAngleFromXAxis(Object obj) {
        if (obj instanceof Point(double x, double y)) {
            System.out.println(Math.toDegrees(Math.atan2(y, x)));
        }
    }

    public static void printAngleFromXAxisVar(Object obj) {
        if (obj instanceof Point(var x, var y)) {
            System.out.println(STR."Avec var : \{Math.toDegrees(Math.atan2(y, x))}");
        }
    }

    // Type Pattern
    public static void printAngleFromXAxisTypePattern(Object obj) {
        if (obj instanceof Point p) {
            System.out.println(Math.toDegrees(Math.atan2(p.y(), p.x())));
        }
    }

    public static String describePoint(Point point) {
        return switch (point) {
            case Point(double x, double y) when x == 0 && y == 0 -> "Origin";
            case Point(double x, double y) when x == 0 -> "On the Y axis";
            case Point(double x, double y) when y == 0 -> "On the X axis";
            case Point(double x, double y) -> STR."At (\{x}, \{y})";
        };
    }

    public static void process(Object obj) {
        switch (obj) {
            case Point(double x, double y) -> System.out.println(STR."Point at (\{x}, \{y})");
            case String s -> System.out.println(STR."String: \{s}");
            case Integer i -> System.out.println(STR."Integer: \{i}");
            default -> System.out.println("Unknown type");
        }
    }

    public static void printRecordGeneric(RecordGeneric<Integer, String> recordGeneric) {
        if (recordGeneric instanceof RecordGeneric<Integer,String>(Integer i, String s)) {
            System.out.println(STR."Record value: \{s}");
        }
    }


    /**
     * Records Imbriqués
     */
    public static void printCity(Personne personne) {
        if (personne instanceof Personne(String name, Adresse(String street, String city))) {
            System.out.println(STR."\{name} habite à \{city}");
        }
    }

    public static void printEmployeeCities(Compagnie company) {
        for (Personne person : company.employees()) {
            if (person instanceof Personne(String name, Adresse(String street, String city))) {
                System.out.println(STR."\{name} habite -- \{city}");
            }
        }
    }


}
