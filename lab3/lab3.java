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
    for(int i=0;i<names.length;i++){
        if (name.equals(names[i])) {
            System.out.println("DETAILS ALREADY EXIST");   
        break;
    } else{
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
        break;

    }
        
    }
   
  }

  public static void displayDetails() {
    Scanner sc = new Scanner(System.in);
    
    
    for(int i=0;i<count;i++){
    int index = i;
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
  }

  public static void searchName() {
    Scanner sc = new Scanner(System.in);
    System.out.println("enter name to be searched");
    String name = sc.nextLine();
    for(int i=0;i<names.length;i++){
      if ((names[i]).equals(name)) {
        System.out.println("searched name " + name  + " exist " + i);
       
      }
      else{
        System.out.println("Cant find the entered name");
      }
    
      return;
  }
}
  
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int option;
    do{
      System.out.println("Menu:");
      System.out.println("1. ENTER THE DETAILS ");
      System.out.println("2. DISPLAY THE DETAILS");
      System.out.println("3. SEARCH NAME");
      System.out.println("4. EXIT");
      System.out.println("ENTER YOUR CHOICE: ");
      int choice = Integer.parseInt(sc.nextLine());
      switch (choice) {
        case 1:
          collectDetails();
          break;
        case 2:
          displayDetails();
          break;
        case 3:
          searchName();
          break;
        case 4:
          System.exit(0);
        default:
          System.out.println("Invalid choice.");
        
      }
      System.out.println("do you want to continue : \n 1.yes \n 2.no");
       option=Integer.parseInt(sc.nextLine());
    }while(option==1);
  }
}
