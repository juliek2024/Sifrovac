import java.awt.*;

import static java.awt.SystemColor.text;

public class Encryption2 {
    public static String swappedHalvesEncryption(String text) {
        String[] sentence = text.split(" ");
        StringBuilder encrypted2 = new StringBuilder();

        for (String word : sentence) {
            String cleanWord = word.replaceAll("[^a-zA-Z]", "");
            String punctuation = word.replaceAll("[a-zA-Z]", "");

            int length = cleanWord.length();
            int middle = cleanWord.length() / 2;
            if (length >= 1 && length % 2 != 0) {
                middle = (cleanWord.length()+1) / 2;
            }

            String halfWord1 = cleanWord.substring(0, middle);
            String halfWord2 = cleanWord.substring(middle);
            encrypted2.append(halfWord2).append(halfWord1).append(punctuation).append(" ");
        }

        return encrypted2.toString().trim();
    }

    public static String swappedHalvesDecryption (String text){

        String[] words = text.split(" ");
        StringBuilder decrypted2 = new StringBuilder();

        for (String word : words) {
            String cleanWord = word.replaceAll("[^a-zA-Z]", "");
            String punctuation = word.replaceAll("[a-zA-Z]", "");

            int length = cleanWord.length();
            int middle = cleanWord.length() / 2;
            if (length >= 1 && length % 2 != 0) {
                middle = (cleanWord.length()-1) / 2;
            }

            String halfWord1 = cleanWord.substring(0, middle);
            String halfWord2 = cleanWord.substring(middle);
            decrypted2.append(halfWord2).append(halfWord1).append(punctuation).append(" ");
        }
        return decrypted2.toString().trim();
    }
}
