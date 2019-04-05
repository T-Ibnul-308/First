import java.util.Scanner;
public class cAssignment501 {
    public static void main(String[]args){
        Scanner keyboard=new Scanner(System.in);
        int []marks=new int[]{10,30,20,50,40};
        int temp=0,sum=0;
        for(int i=0;i<marks.length;i++){
            for(int j=0;j<marks.length;j++){
                if(marks[i]<marks[j]){
                    temp=marks[i];
                    marks[i]=marks[j];
                    marks[j]=temp;
                }
            }

        }
        for(int i=0;i<marks.length;i++){sum+=marks[i];}
        System.out.println("Highest marks is "+marks[marks.length-1]);
        System.out.println("Lowest marks is "+marks[0]);
        System.out.println("Average is "+(sum/marks.length));
    }
}
