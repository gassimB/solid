package dev.nouveautes.java10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

import static java.lang.StringTemplate.STR;

public class LocalVariableInference {

    public static void exempleLocalVar() throws IOException {
        var url = new URL("http://www.oracle.com/");
        var conn = url.openConnection();
        var reader = new BufferedReader(
                new InputStreamReader(conn.getInputStream()));


        var list = new ArrayList<String>();    // infers ArrayList<String>
        var stream = list.stream();            // infers Stream<String>
        String fileName = "filename";
        var path = Paths.get(fileName);        // infers Path
        var bytes = Files.readAllBytes(path);  // infers bytes[]


        List<String> myList = Arrays.asList("a", "b", "c");
        for (var element : myList) { // infers String
            System.out.println(element);
        }

        var map = new HashMap<String, List<Integer>>();
        map.put("Numbers", List.of(1, 2, 3, 4));

        for (var entry : map.entrySet()) {
            var key = entry.getKey();
            var value = entry.getValue();
            System.out.println(STR."\{key}: \{value}");
        }

    }
}
