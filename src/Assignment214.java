import java.util.Scanner;
public class Assignment214
{
    public static void main(String[]args)
    {
        System.out.print("Enter the value: ");
        Scanner keyboard= new Scanner(System.in);
        int x;
        x=keyboard.nextInt();
        if(x>=0)
        {
            System.out.println("value: "+x);
        }
        else
            {
                System.out.println("value:"+(x*-1));
            }
    }
}
