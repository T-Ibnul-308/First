import java.util.Scanner;
public class Assignment222
{ public static void main(String[]args)
    { System.out.print("Enter an integer: ");
        Scanner keyboard= new Scanner(System.in);
        int x=keyboard.nextInt();
        if(x%2==0 || x%5==0){ }
        else{ System.out.println(x); }

    }
}
