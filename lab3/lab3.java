
package lab3;
import java.util.Scanner;

public class lab3 {
  static String[] names = new String[1024];
  static String[][] details = new String[1024][5];
  static int count = 0;

  public static void collectDetails() {
    Scanner sc = new Scanner(System.in);
    System.out.println("ENTER DETAILS OF THE STUDENT:");
    System.out.print("NAME: ");
    String name = sc.nextLine();
    if (searchName(name) != -1) {
      System.out.println("DETAILS ALREADY EXIST");
      return;
    }
    names[count] = name;
    System.out.print("REGISTER NUMBER: ");
    details[count][1] = sc.nextLine();
    System.out.print("Email: ");
    details[count][2] = sc.nextLine();
    System.out.print("CLASS: ");
    details[count][3] = sc.nextLine();
    System.out.print("DEPARTMENT: ");
    details[count][4] = sc.nextLine();
    count++;
  }

  public static void displayDetails() {
    Scanner sc = new Scanner(System.in);
    System.out.print("ENTER THE NAME OF THE STUDENT: ");
    String name = sc.nextLine();
    int index = searchName(name);
    if (index == -1) {
      System.out.println("DETAILS NOT FOUND");
      return;
    }
    System.out.println("DETAILS OF THE STUDENT:");
    System.out.println("NAME OF THE STUDENT: " + names[index]);
    System.out.println("REGISTER NUMBER: " + details[index][1]);
    System.out.println("Email: " + details[index][2]);
    System.out.println("CLASS: " + details[index][3]);
    System.out.println("DEPARTMENT: " + details[index][4]);
  }


  public static int searchName(String name) {
    for (int i = 0; i < count; i++) {
      if (names[i].equals(name)) {
        return i;
      }
    }
    return -1;
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    while (true) {
      System.out.println("Menu:");
      System.out.println("1. ENTER THE DETAILS ");
      System.out.println("2. DISPLAY THE DETAILS");
      System.out.println("3. EXIT");
      System.out.print("ENTER YOUR CHOICE: ");
      int choice = sc.nextInt();
      switch (choice) {
        case 1:
          collectDetails();
          break;
        case 2:
          displayDetails();
          break;
        case 3:
          System.exit(0);
        default:
          System.out.println("Invalid choice.");
      }
    }
  }}