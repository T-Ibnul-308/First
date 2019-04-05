import java.util.Scanner;
public class cAssignment317
{
    public static void main(String[]args)
    {
        float a=0, b=1,i=0,sum=0;
        System.out.print("enter number,n: ");
        Scanner keyboard =new Scanner(System.in);
        float n=keyboard.nextFloat();
        System.out.println(a);
        System.out.println(b);
        while (i<=n-3)
        {
            sum=a+b;
            System.out.println(sum);
            float c;
            c=a;
            a=b;
            b=sum;
            i++;
        }

    }

}
