import java.util.Scanner;	

public class lab5{

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int option;

        do {
            System.out.println("Menu:");
            System.out.println("1. Encrypt a message");
            System.out.println("2. Decrypt a message");
            System.out.println("3. Exit");

            System.out.print("Enter your choice: ");
            option = scanner.nextInt();

            switch (option) {
                case 1:
                    System.out.print("Enter the message to encrypt: ");
                    String messageToEncrypt = scanner.next();
                    String encryptedMessage = encrypt(messageToEncrypt);
                    System.out.println("Encrypted message: " + encryptedMessage);
                    break;
                case 2:
                    System.out.print("Enter the message to decrypt: ");
                    String messageToDecrypt = scanner.next();
                    String decryptedMessage = decrypt(messageToDecrypt);
                    System.out.println("Decrypted message: " + decryptedMessage);
                    break;
                case 3:
                    System.out.println("Exiting from the program");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }
        } while (choice != 3);
    }

    public static String encrypt(String message) {
        String cipher = "XYZABCDEFGHIJKLMNOPQRSTUVW";
        String encryptedMessage = "";

        for (int i = 0; i < message.length(); i++) {
            char ch = message.charAt(i);

            if (Character.isLetter(ch)) {
                int index = Character.toUpperCase(ch) - 'A';
                char encryptedChar = cipher.charAt(index);

                if (Character.isLowerCase(ch)) {
                    encryptedChar = Character.toLowerCase(encryptedChar);
                }
                encryptedMessage += encryptedChar;
            } else {
                encryptedMessage += ch;
            }
        }

        return encryptedMessage;
    }

    public static String decrypt(String message) {
        String cipher = "XYZABCDEFGHIJKLMNOPQRSTUVW";
        String decryptedMessage = "";

        for (int i = 0; i < message.length(); i++) {
            char ch = message.charAt(i);

            if (Character.isLetter(ch)) {
                int index = cipher.indexOf(Character.toUpperCase(ch));
                char decryptedChar = (char) ('A' + index);

                if (Character.isLowerCase(ch)) {
                    decryptedChar = Character.toLowerCase(decryptedChar);
                }
                decryptedMessage += decryptedChar;
            } else {
                decryptedMessage += ch;
            }
        }

        return decryptedMessage;
    }
}
