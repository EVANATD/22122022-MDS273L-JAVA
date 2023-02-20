package lab3;
\\ FUNCTION BASED EXERCISE
write a function in java that accept an integer array as an argument and returns the ,MEAN of values in an array
import java.util.Scanner;
public class javaexercise {
    public static void main(String[] args)
    static String[] number = new String[1024];
  Scanner sc = new Scanner(System.in);
  System.out.print("ENTER THE NUMBER: ");
  String numbers = sc.nextLine();
  int sum=0;
  for(int i=0;i<number.length;i++){
    sum= sum +number [i];
    double average=sum/number.length;
    System.out.println("average is:");

  }
    
}
\\\ write a java function that takes a string as input and returns the middle character.


\\\ write a java function that takes a string as input and returns the count of the number of each vowel in the string.