import jdk.swing.interop.SwingInterOpUtils;

import java.util.Scanner;

public class cAssignment508
{public static void main(String[] args) {
    Scanner keyboard = new Scanner(System.in);
    System.out.print("Enter quantity,q :");
    int q = keyboard.nextInt();
    int marks[]=new int[q];
    System.out.println("Enter the marks :");
    for ( int i = 0; i < marks.length; i++) {
        marks[i]=keyboard.nextInt();
    }
    int temp=0;
    for ( int i = 0; i < marks.length; i++) {
        for(int j=0;j<marks.length;j++){
            if(marks[i]<marks[j]){
                temp=marks[i];
                marks[i]=marks[j];
                marks[j]=temp;
            }
        }
    }for ( int i = 0; i < marks.length; i++) {
        System.out.print(marks[i]+" ");
    }
    if(q%2==0){
        int sum=marks[(q/2)-1]+marks[q/2];
        System.out.println("Median "+(sum/2));
    }
    else{
        int m=(q-1)/2;
        System.out.println("Median "+marks[m]);
    }
  }
}
