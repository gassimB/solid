package dev.nouveautes.java21;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class StringTemplate {

    public static void exempleSTR() {
        double x = 10.5, y = 20.6;
        String p = STR."\{x} * \{y} = \{x * y}";
        System.out.println(p);

        int index = 0;
        String data = STR."\{index++}, \{index++}, \{++index}, \{index++}, \{index}";
        System.out.println(data);


        String time = STR."Today is \{java.time.LocalDate.now()}";
        System.out.println(time);
        String canLang = STR."The language code of \{
                Locale.CANADA_FRENCH} is \{
                Locale.CANADA_FRENCH.getLanguage()}";
        System.out.println(canLang);

        Path filePath = Paths.get("Stemp.java");
        String msg = STR."The file \{filePath} \{
                // The Files class is in the package java.nio.file
                Files.exists(filePath) ? "does" : "does not"} exist";
        System.out.println(msg);

        String currentTime = STR."The time is \{
                DateTimeFormatter
                        .ofPattern("HH:mm:ss")
                        .format(LocalTime.now())
                } right now";
        System.out.println(currentTime);

        String title = "My Web Page";
        String text = "Hello, world";
        String webpage = STR."""
            <html>
              <head>
                <title>\{title}</title>
              </head>
              <body>
                <p>\{text}</p>
              </body>
            </html>
        """;
        System.out.println(webpage);
    }
}
