import java.util.Scanner;
public class Assinw0408{

   public static void main(String[]args){
            System.out.print("Enter num,n :");
            Scanner keyboard = new Scanner(System.in);
            int n=keyboard.nextInt();
            int i=1,counter=0,divisor;
       while(i<=n){
            if(n%i==0){divisor=n/i;
                System.out.println("Divisor :"+divisor);
            counter++;
            }i++;
        }

        System.out.println("Total Divisor :"+counter);
    }
}
