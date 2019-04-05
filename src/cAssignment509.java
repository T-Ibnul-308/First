import java.util.Scanner;

public class cAssignment509 {public static void main(String[] args) {
    Scanner keyboard = new Scanner(System.in);
    System.out.print("Enter num of student,n :");
    int n = keyboard.nextInt();
    double[] marks = new double[n];
    int[] id = new int[n];
    String[] name = new String[n];
    for(int i=0;i<n;i++){
        System.out.println("Enter ID :");
         id[i]=keyboard.nextInt();
        System.out.println("Enter Name :");
         name[i]=keyboard.next();
        System.out.println("Enter marks :");
        marks[i]=keyboard.nextDouble();
    }
    int sum=0,avg;
    for(int j=0;j<n ; j++)
    {sum+=marks[j];}
    avg=sum/n;
    System.out.println("Average mark :"+avg);
    for(int j=0;j<n ; j++){
        System.out.println(name[j]+" : "+marks[j] +" ID : "+id[j] );
    }
 }
}
