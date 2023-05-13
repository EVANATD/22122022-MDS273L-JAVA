import java.util.*;

public class lab2 {

    public static void main(String[] args){

        Scanner scan=new Scanner(System.in);
        String[] names=new String[1024];
        int option;
        int elm=0;
        do{
            System.out.println("which option would you like to choose \n 1.add name \n 2.seachname \n3.remove name \n 4.show all names");
            int choice=Integer.parseInt(scan.nextLine());
            switch(choice){
                case 1:
                System.out.println("Enter number of names you want to enter :");
                int num=Integer.parseInt(scan.nextLine());
                for(int i=0;i<num;i++){
                    System.out.println("Enter the name :");
                    String name=scan.nextLine();
                    boolean found=false;
                    for(int j=0;j<names.length;j++){
                        if(name.equals(names[j])){
                            System.out.println("NAME EXIST");
                            found=true;
                            break;
                        }

                    }
                    if(!found){
                        names[elm]=name;
                        elm++;
                    }
                }
                break;
                case 2:
                System.out.println("Enter the name you want to search :");
                String searchname=scan.nextLine();
                boolean found=false;
                for(int i=0;i<elm;i++){
                    if(searchname.equals(names[i])){
                        System.out.println("Searched name is " + searchname + " with index position " +i);
                        found=true;
                        break;
                    }

                }
                if(!found){
                    System.out.println("CANT FIND THE GIVEN NAME");
                }
                break;
                
                case 3:
                int index=-1;
                System.out.print("Enter the name you want to remove :");
                String removename=scan.nextLine();
                for(int i=0;i<elm;i++){
                        if(names[i].equals(removename)){
                            index=i;
                            break;
                        }
                    }
                    
                    if(index==-1){
                        System.out.println("CANT FIND THE GIVEN NAME");
                        break;
                    }
                    else{
                        for(int j=index;j<elm-1;j++){
                            names[j]=names[j+1];
                        }
                        elm--;
                        System.out.println("The name " +removename+ " has been removed");
                    }  
                    break;
                    case 4:
                       for(int i =0;i<elm;i++){
                            System.out.println(names[i]);
                         }
                    break;
                     
                }

                
                System.out.println("Do you wish to continue \n1.yes  \n2.no");
                option =Integer.parseInt(scan.nextLine());
            

            }while(option==1);
               
            
        }
           

}
