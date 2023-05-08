import java.util.*;
import java.io.*;
public class lab7 {
    static float MEAN(float[] numbers){
        float sum=0;
        for(int i=0;i<numbers.length;i++){
            sum=sum+numbers[i];
        }
        float MEAN=sum/numbers.length;
        return MEAN;
    }
    static float MEDIAN(float[] numbers){
        float MEDIAN;
        Arrays.sort(numbers);
        if(numbers.length%2==0){
            int a=(numbers.length)/2;
            int b=a-1;
            MEDIAN=(numbers[a]+numbers[b])/2.0f;
        }else{
            MEDIAN=numbers[((numbers.length)/2)];
        }
        return MEDIAN;
    }
    static float mode(float[] numbers){
        int[] numbercount=new int[numbers.length];
        float mode=0;
        int max=0;
        for(int i=0;i<numbers.length;i++){
            int count=0;
            for(int j=0;j<numbers.length;j++){
                if(numbers[j]==numbers[i]){
                    count++;
                }
            }
            numbercount[i]=count;   
            if(count>max){
                max=count;
                mode=numbers[i];
            }
        } 
        return mode; 
        }
        static float min(float[] numbers){
            float min=numbers[0];
            for (int i=0;i<numbers.length;i++){
                if(numbers[i]<min){
                    min=numbers[i];
                }
            }
            return min;
        }
        static float max(float[] numbers){
            float max=numbers[0];
            for (int i=0;i<numbers.length;i++){
                if(numbers[i]>max){
                    max=numbers[i];
                }
            }
            return max;
        }
        
        static void display(String[][] numbers,int count,String filename){
           float[] sepallength=new float[count];
           float[] sepalwidth=new float[count];
           float[] petallength=new float[count];
           float[] petalwidth=new float[count];
           
           for (int i=1;i<=count;i++){
                sepallength[i-1]=Float.parseFloat(numbers[i][1]);
                sepalwidth[i-1]=Float.parseFloat(numbers[i][2]);
                petallength[i-1]=Float.parseFloat(numbers[i][3]);
                petalwidth[i-1]=Float.parseFloat(numbers[i][4]);
           }
            String[] firstrow={"Parameters","MEAN","MEDIAN","Mode","Max","Min"};
            String[] secondrow={"Sepal Length",MEAN(sepallength)+"",MEDIAN(sepallength)+"",mode(sepallength)+"",max(sepallength)+"",min(sepallength)+""};
            String[] thirdrow={"Sepal Width",MEAN(sepalwidth)+"",MEDIAN(sepalwidth)+"",mode(sepalwidth)+"",max(sepalwidth)+"",min(sepalwidth)+""};
            String[] fourthrow={"Petal Length",MEAN(petallength)+"",MEDIAN(petallength)+"",mode(petallength)+"",max(petallength)+"",min(petallength)+""};
            String[] fifthrow={"Petal Width",MEAN(petalwidth)+"",MEDIAN(petalwidth)+"",mode(petalwidth)+"",max(petalwidth)+"",min(petalwidth)+""};
            
            System.out.println(Arrays.toString(firstrow));
            System.out.println(Arrays.toString(secondrow));
            System.out.println(Arrays.toString(thirdrow));
            System.out.println(Arrays.toString(fourthrow));
            System.out.println(Arrays.toString(fifthrow));
            
            
            try{
                FileWriter write=new FileWriter(filename,true);
                write.write(Arrays.toString(firstrow)+"\n");
                write.write(Arrays.toString(secondrow)+"\n");
                write.write(Arrays.toString(thirdrow)+"\n");
                write.write(Arrays.toString(fourthrow)+"\n");
                write.write(Arrays.toString(fifthrow)+"\n");
                write.close();

            }catch(Exception e){
                System.out.println(e.getMessage());
            }
            



            }
      
        public static void main(String[] args){
            String[][] arr = new String[1024][6];
            int n=0;
            try{
                File file=new File("C:/Users/hp/Downloads/Iris.csv");
                Scanner read=new Scanner(file);
                while(read.hasNextLine()){
                  String x=read.nextLine();
                  arr[n]=x.split(",");
                  n++;
                }
            }catch(Exception e){
                System.out.println(e.getMessage());
            }
        int temp1=0;
        int temp2=0;
        int temp3=0;
        String[][] setosa=new String[1024][6];
        String[][] versicolor=new String[1024][6];
        String[][] virginica=new String[1024][6];
        for(int i=1;i<n;i++){
            if(arr[i][5].equals("Iris-setosa")){
                setosa[temp1]=arr[i];
                temp1++;
            }
            if(arr[i][5].equals("Iris-versicolor")){
                versicolor[temp2]=arr[i];
                temp2++;
            } 
            
            if(arr[i][5].equals("Iris-virginica")){
                virginica[temp3]=arr[i];
                temp3++;
            }

        }
        for(int k=0;k<temp2;k++){
            for(int m=0;m<6;m++){
                System.out.print(versicolor[k][m]+" ");
            }
            System.out.println();
        }
        String file="summary.txt";
        System.out.println("Total Summary : ");
        display(arr,n-1,file);
        System.out.println("Setosa : ");
        display(setosa,temp1-1,file);
        System.out.println("Versicolor : ");
        display(versicolor,temp2-1,file);
        System.out.println("Virginica : ");
        display(virginica,temp3-1,file);
        
       
        

        }
        
            
    }

