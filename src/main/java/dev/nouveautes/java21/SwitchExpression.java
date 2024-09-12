package dev.nouveautes.java21;

public class SwitchExpression {

    public enum Day { SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY; }
    public static void switchExemple(final Day day) {

        int numLetters = 0;
        // Day.WEDNESDAY;
        numLetters = switch (day) {
            case MONDAY, FRIDAY, SUNDAY -> 6;
            case TUESDAY -> 7;
            case THURSDAY, SATURDAY -> 8;
            case WEDNESDAY -> 9;
            default -> throw new IllegalStateException(STR."Invalid day: \{day}");
        };


        int numLetters2 = switch (day) {
            case MONDAY, FRIDAY, SUNDAY -> {
                System.out.println(6);
                yield 6;
            }
            case TUESDAY -> {
                System.out.println(7);
                yield 7;
            }
            case THURSDAY, SATURDAY -> {
                System.out.println(8);
                yield 8;
            }
            case WEDNESDAY -> {
                System.out.println(9);
                yield 9;
            }
            default -> {
                throw new IllegalStateException(STR."Invalid day: \{day}");
            }
        };


        System.out.println(numLetters);

        System.out.println(numLetters2);
    }
}
