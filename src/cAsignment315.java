import java.util.Scanner;
public class cAsignment315
{ public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);
        int i, sum = 0;
        for(i=1;i<=20;i++)
        {
            System.out.print("Enter num,n :");
            int n = keyboard.nextInt();
            sum=sum+n;
            System.out.println("sum :"+sum);
        }
    }
}
