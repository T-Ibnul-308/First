import java.util.Scanner;
public class cAssignment325
{ public static void main(String[]args)
{
    System.out.print("Enter the number,n: ");
    Scanner keyboard=new Scanner(System.in);
    int n=keyboard.nextInt();
    int i=1;
    int counter=0;
    while(i<=n){
        if(n%i==0){
            counter++;
        }i++;
    }
    System.out.println("No. of divisor "+counter);
}
}
