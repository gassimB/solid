package dev.nouveautes.java21;

import dev.nouveautes.java21.record.Point;

import java.util.function.Function;

public class UnnamedPatternVariable {

    public static void processPoint(Object obj) {
        if (obj instanceof Point(double x, _)) {  // On ignore y
            System.out.println(STR."x = \{x}");
        } else {
            System.out.println("Not a Point");
        }
    }

    public static void addListInt() {
        int[] orderIDs = {34, 45, 23, 27, 15};
        int total = 0;
        for (int _ : orderIDs) {
            total++;
        }
        System.out.println(STR."Total: \{total}");
    }

    public static void forEachUnnamed() {
        Function<String,Integer> sideEffect =
                s -> {
                    System.out.println(s);
                    return 0;
                };

        for (int i = 0, _ = sideEffect.apply("Starting for-loop");
             i < 10; i++) {
            System.out.println(i);
        }
    }

    static void validateNumber(String s) {
        try {
            int i = Integer.parseInt(s);
            System.out.println(STR."\{i} is valid");
        } catch (NumberFormatException _) {
            System.out.println(STR."\{s} isn't valid");
        }
    }

}
