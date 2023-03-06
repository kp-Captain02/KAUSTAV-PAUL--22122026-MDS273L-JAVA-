import java.util.Scanner;

public class lab5 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int choice;
    String message, result;

    do {
      System.out.println("Choose an option:");
      System.out.println("1. Encrypt a message");
      System.out.println("2. Decrypt a message");
      System.out.println("3. Exit");

      choice = sc.nextInt();

      switch (choice) {
        case 1:
          System.out.println("Enter the message to be encrypted:");
          sc.nextLine();
          message = sc.nextLine();
          result = encrypt(message);
          System.out.println("Encrypted message: " + result);
          break;
        case 2:
          System.out.println("Enter the message to be decrypted:");
          sc.nextLine();
          message = sc.nextLine();
          result = decrypt(message);
          System.out.println("Decrypted message: " + result);
          break;
        case 3:
          System.out.println("Exiting the program...");
          break;
        default:
          System.out.println("Invalid choice. Try again.");
      }
    } while (choice != 3);
  }

  public static String encrypt(String message) {
    String result = "";
    for (int i = 0; i < message.length(); i++) {
      char c = message.charAt(i);
      if (Character.isLetter(c)) {
        if (Character.isUpperCase(c)) {
          result += (char) ('A' + (c - 'A' + 23) % 26); // 'A' = 65, 'X' = 88, 'Y' = 89, 'Z' = 90
        } else {
          result += (char) ('a' + (c - 'a' + 23) % 26); // 'a' = 97, 'x' = 120, 'y' = 121, 'z' = 122
        }
      } else {
        result += c;
      }
    }
    return result;
  }

  public static String decrypt(String message) {
    String result = "";
    for (int i = 0; i < message.length(); i++) {
      char c = message.charAt(i);
      if (Character.isLetter(c)) {
        if (Character.isUpperCase(c)) {
          result += (char) ('A' + (c - 'A' + 3) % 26); // 'A' = 65, 'X' = 88, 'Y' = 89, 'Z' = 90
        } else {
          result += (char) ('a' + (c - 'a' + 3) % 26); // 'a' = 97, 'x' = 120, 'y' = 121, 'z' = 122
        }
      } else {
        result += c;
      }
    }
    return result;
  }
}
