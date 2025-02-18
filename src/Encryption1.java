import java.awt.*;

import static java.awt.SystemColor.text;

public class Encription1 {

    public static String reversedEncription (String text) {
    String [] sentence = text.split(" ");
    StringBuilder encripted1 = new StringBuilder();

    for (String word : sentence) {
        String reversedWord = new StringBuilder(word).reverse().toString();
        encripted1.append(reversedWord).append(" ");
    }
        return encripted1.toString().trim();
    }

    public static String reversedDecription (String text) {
        return reversedEncription(text);
    }
}
