import java.util.Scanner;
public class check
{ public static void main(String[]args)
{
    Scanner keyboard=new Scanner(System.in);
    int i,n,c;
    System.out.print("Enter start value: ");
    i=keyboard.nextInt();
    System.out.print("Enter end value: ");
    n=keyboard.nextInt();
    System.out.print("Enter Difference value: ");
    c=keyboard.nextInt();
    while(i<=n)
    {
        System.out.println(i);
        i+=c;
    }

}
}
