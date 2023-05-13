import java.util.*;
public class lab2{
    public static void main(String[] args){
        String name;
        int age;
        String state;
        char gender;
        int salary;
        String company;
        Scanner scan = new Scanner(System.in);
        System.out.print("enter name : ");
        name=scan.nextLine();
        System.out.print("enter age : ");
        age=Integer.parseInt(scan.nextLine());
        System.out.print("enter state : ");
        state=scan.nextLine();
        System.out.print("enter gender : ");
        gender=scan.nextLine().charAt(0);
        System.out.print("enter salary : ");
        salary=Integer.parseInt(scan.nextLine());
        System.out.print("Enter company name : ");
        company=scan.nextLine();
            
        if(gender=='f'){
            System.out.print("The employee " + name + " is female\n");
        }else if(gender=='m'){
                System.out.print("Employee " + name + " is male\n");
            }
            switch(state){
                case "jammu and ashmir":
                case "delhi":
                case "uttar pradesh":
                {
                    System.out.print(name + "is coming from " + state + " which is the northern part of india\n");
                    break;
                }

            
                case "gujarat":
                case "goa":
                case "madhyapradesh":
                case "maharashtra":
                {
                    System.out.print(name + "is coming from " + state +" which is the western part of india\n");
                    break;
                }

                case "westbengal":
                case "bihar":
                case "jharkhand":
                case "odisha":
                {
                    System.out.print(name + "is coming from " + state + " which is the eastern part of india\n");
                    break;
                }

                case "kerala":
                case "tamil nadu":
                case "andhra pradesh":
                case "karnataka":
                case "telangana":
                {
                    System.out.print(name + "  is coming from " + state +" which is the southern part of india\n");
                    break;
                }
                default:{
                    System.out.print("invalid state");
                    break;
                }
            }
            switch(company){
                case "Google":
                case "Facebook":
                case "Samsung":
                case "IBM":
                case "Apple":
                System.out.print(name + " belong to the top MNC which is " + company);
                break;
            
            default:
                System.out.print(name + " does not belong to the top MNC");
                break;
            

            }
          
          
          }
          
          
}
    
