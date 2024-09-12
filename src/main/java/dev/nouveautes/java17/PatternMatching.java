package dev.nouveautes.java17;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class PatternMatching {

    private final List<String> immutableList = List.of("a", "b", "c");
    private final Set<String> immutableSet = Set.of("x", "y", "z");
    private final Map<String, Integer> immutableMap = Map.of("key1", 1, "key2", 2);
    public PatternMatching() {
    }

    // Pattern matching
    public void showObjectByMatch(final Object obj) {
        if (obj instanceof List<?> list) {
            list.forEach(System.out::println);
        }
    }

    /**
     * Depuis java 9 -> collection immuable
     */
    public void afficherCollectionImmuable() {
        this.showObjectByMatch(immutableList);
        this.showObjectByMatch(immutableSet);
        this.showObjectByMatch(immutableMap);
    }
}
