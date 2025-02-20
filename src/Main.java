public class Main {
    public static void main(String[] args) {

        String text = "mary mela beranka, bily byl jak snih " +
                "i kdyz vysla za vratka, beranek sel s ni";

//        Scanner userText = new Scanner(System.in);
//        System.out.println("Zadejte text: ");
//        String text = userText.nextLine();

        String encryptedTextPattern1 = Encryption1.reversedEncryption(text);
        System.out.println("Encription, pattern 1: " + encryptedTextPattern1);

        String decryptedTextPattern1 = Encryption1.reversedDecryption(encryptedTextPattern1);
        System.out.println("Decription, pattern 1: " + decryptedTextPattern1);

        String encryptedTextPattern2 = Encryption2.swappedHalvesEncryption(text);
        System.out.println("Encription, pattern 2: " + encryptedTextPattern2);

        String decryptedTextPattern2 = Encryption2.swappedHalvesDecryption(encryptedTextPattern2);
        System.out.println("Decription, pattern 2: " + decryptedTextPattern2);
    }
}
