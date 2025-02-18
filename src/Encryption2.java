import java.awt.*;

import static java.awt.SystemColor.text;

public class Encription2 {
    public static String halfReversedEncription(String text) {
        String[] sentence = text.split(" ");
        StringBuilder encripted2 = new StringBuilder();
        int length = text.length();
        int middle = length / 2;
        if (length % 2 == 0) {
            return text.substring(middle - 1, middle + 1);
        } else {
            return text.substring(middle, middle + 1);
            for (String word : sentence) {
                String halfWord1 = word.substring(0, middle);
                String halfWord2 = word.substring(middle);
                String halfReversedWord = halfWord1 + halfWord2;
                encripted2.append(halfReversedWord).append(" ");
            }
            return encripted2.toString().trim();
        }

        public static String halfReversedDecription (String text) {
            return halfReversedEncription(text);
        }
    }
}

