import java.util.Scanner;
import java.io.*;

class Student {
    int RegNo;
    String Name;
    String Email;
    String Phone;
    String ClassName;
    String Department;

    Student(int RegNo, String Name, String Email, String Phone, String className, String Department) {
        this.RegNo = RegNo;
        this.Name = Name;
        this.Email = Email;
        this.Phone = Phone;
        this.ClassName = className;
        this.Department = Department;
    }

    public void Display(String filename){
        System.out.println("Reg No: " + RegNo);
        System.out.println("Name: " + Name);
        System.out.println("Email: " + Email);
        System.out.println("Phone: " + Phone);
        System.out.println("Class: " + ClassName);
        System.out.println("Department: " + Department);
        try{
            FileWriter write = new FileWriter(filename,true);
            write.write("Reg No: " + RegNo);
            write.write("Name: " + Name);
            write.write("Email: " + Email);
            write.write("Phone: " + Phone);
            write.write("Class: " + ClassName);
            write.write("Department: " + Department);
            write.close();
        }
        catch(Exception e){
            System.out.println(e);
        }
    }

}

public class lab6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Student[] arr = new Student[100];
        int count = 0;
        int input;
        String studentdetails="Student Details.txt";
        while (true) {
            System.out.println("Enter your choice:");
            System.out.println("1.Add student");
            System.out.println("2.Search a student");
            System.out.println("3.Display");
            System.out.println("4.Update student details");
            System.out.println("6.Exit");
            int choice = scan.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Enter regno:");
                    int RegNo = scan.nextInt();
                    scan.nextLine();
                    System.out.println("Enter name:");
                    String Name = scan.nextLine();
                    System.out.println("Enter email");
                    String Email = scan.nextLine();
                    System.out.println("Enter phone number:");
                    String Phone = scan.nextLine();
                    System.out.println("Enter class:");
                    String ClassName = scan.nextLine();
                    System.out.println("Enter department:");
                    String Department = scan.nextLine();
                    arr[count] = new Student(RegNo,Name,Email,Phone,ClassName,Department);
                    count = count + 1;
                    break;

                case 2:
                    System.out.println("Enter the regno you want to search:");
                    int regno = scan.nextInt();
                    scan.nextLine();
                    System.out.println("Enter the name you want to search:");
                    String name = scan.nextLine();
                    boolean found = false;
                    for (int i = 0; i < count; i++) {
                        if (arr[i].RegNo == regno && arr[i].Name.equals(name)) {
                            arr[i].Display(studentdetails);
                            found = true;
                            break;
                        }
                    }
                    if (!found) {
                        System.out.println("No student found with registration number " + regno + " and name " + name + ".");
                    }
                    break;

                case 3:
                    for (int i = 0; i < count; i++) {
                        arr[i].Display(studentdetails);
                    }
                    break;
                    
                case 4:
                    System.out.println("Enter the registration number of the student you want to update:");
                    int uregno = scan.nextInt();
                    scan.nextLine();
                    boolean ufound = false;
                    for (int i = 0; i < count; i++) {
                        if (arr[i].RegNo == uregno) {
                            System.out.println("Enter updated name:");
                            String updatedName = scan.nextLine();
                            System.out.println("Enter updated email:");
                            String updatedEmail = scan.nextLine();
arr[i].Name = updatedName;
arr[i].Email = updatedEmail;
ufound = true;
System.out.println("Student details updated successfully!");
break;
}
}
if (!ufound) {
System.out.println("Student with registration number " + uregno + " not found!");
}
break;
case 6:
System.out.println("Exiting from the program");
return;
default:
System.out.println("Invalid choice. Please enter a number between 1 and 6.");
break;
}
}
}
}


