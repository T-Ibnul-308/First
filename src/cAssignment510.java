import java.util.Scanner;

public class cAssignment510 {public static void main(String[] args) {
    Scanner keyboard = new Scanner(System.in);
    System.out.print("Enter quantity,q :");
    int q = keyboard.nextInt();
    int marks[]=new int[q];
    System.out.println("Enter the marks :");
    for ( int i = 0; i < marks.length; i++) {
        marks[i]=keyboard.nextInt();
    }
    boolean flag=false;
    for ( int i = 0; i < q-1; i++) {
        if(marks[i]<marks[i+1]){flag=true;
       }
        else{
        flag=false; break;}
    }
    if(flag==true){
        System.out.println("Yes.");
    }else{
        System.out.println("No.");
    }
  }
}
