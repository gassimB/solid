package dev.nouveautes.java17;

public class TextBlock {

    public static void showHtml() {
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
