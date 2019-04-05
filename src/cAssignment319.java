import java.util.Scanner;
public class cAssignment319 {
     public static void main(String[]args){

            System.out.print("Enter the number,n: ");
            Scanner keyboard = new Scanner(System.in);
            int n = keyboard.nextInt();
            int i = 1;
            int p = 1;
            while (i<=n) {
                p=p*10;
                i++;
            }
         System.out.println(p);
        }}