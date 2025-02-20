import java.awt.*;

import static java.awt.SystemColor.text;

public class Encryption1 {

    public static String reversedEncryption (String text) {
        String [] sentence = text.split(" ");
        StringBuilder encrypted1 = new StringBuilder();

        for (String word : sentence) {
            String cleanWord = word.replaceAll("[^a-zA-Z]", "");
            String punctuation = word.replaceAll("[a-zA-Z]", "");
            encrypted1.append(new StringBuilder(cleanWord).reverse()).append(punctuation).append(" ");
        }
        return encrypted1.toString().trim();
    }

    public static String reversedDecryption (String text) {
        return reversedEncryption(text);
    }
}
