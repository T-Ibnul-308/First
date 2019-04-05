import java.util.Scanner;

public class cAssignment504b {public static void main(String[] args) {
    Scanner keyboard = new Scanner(System.in);
    System.out.print("Enter quantity,q :");
    int q = keyboard.nextInt();
    int marks[]=new int[q];
    System.out.println("Enter the marks :");
    for ( int i = 0; i < marks.length; i++) {
        marks[i]=keyboard.nextInt();
    }

    for ( int i = 0; i < marks.length; i++)
    {
        if (marks[i]!=0 ) {
            System.out.print(marks[i] + " ");
        }
    }
    for (int i = 0; i < marks.length; i++) {
        if (marks[i] == 0){
            System.out.print(marks[i] + " ");}

    }
}
}
