package dev.nouveautes.java8;

import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Fonctions {

    public static void useFonction() {
        Function<String,Integer> sideEffect =
            s -> {
                System.out.println(s);
                return 0;
            };
        Function<String, String> toUpperCase = String::toUpperCase;
        Function<String, String> addExclamation = s -> STR."\{s}!";
        Function<Integer, String> intToString = i -> STR."Number: \{i}";
        Function<String, Integer> stringToLength = String::length;



        for (int i = 0, _ = sideEffect.apply("Starting for-loop");
             i < 10; i++) {
            System.out.println(i);
        }

        // Combinaison des fonctions
        Function<String, String> excitingUpperCase = toUpperCase.andThen(addExclamation);

        String result = excitingUpperCase.apply("hello");
        System.out.println(result);  // Output: HELLO!


        List<String> words = List.of("apple", "banana", "cherry");

        // Convertir chaque mot en majuscule
        List<String> uppercasedWords = words.stream()
                .map(String::toUpperCase)
                .collect(Collectors.toList());

        System.out.println(uppercasedWords);  // Output: [APPLE, BANANA, CHERRY]


        Function<Integer, Integer> intToLength = intToString.andThen(stringToLength);

        int length = intToLength.apply(12345);
        System.out.println(STR."Length: \{length}");  // Output: Length: 11
    }
}
