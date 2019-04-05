import java.util.Scanner;
public class cAsignment316
{
    public static void main (String[]args){
    int i=1, max=0, min=99, sum=0;
        Scanner keyboard=new Scanner(System.in);
        while(i<=10){
        System.out.println("Enter marks: ");
            int marks=keyboard.nextInt();
            if (marks>=0 && marks<=100){
        sum=sum+marks;
        if(marks>max)
            max=marks;
        else{
            if(marks<min)
            {min=marks;}
        }}
        i++;
    }
        System.out.println("Average: "+(sum/10));
        System.out.println("Max: "+max);
        System.out.println("Min: "+min);
}
}
