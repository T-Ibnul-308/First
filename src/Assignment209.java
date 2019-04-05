import java.util.Scanner;
public class Assignment209
{
    public static void main(String[]args)
    {
        System.out.println("Enter the no.");
        Scanner keyboard=new Scanner(System.in);
        double x,y,z;
        x=keyboard.nextDouble();
        y=keyboard.nextDouble();
        z=keyboard.nextDouble();
        if(x>y)
        {if(x>z)
        {
            System.out.println("x is largest");
        }
        else{
            System.out.println("z is largest");
        }
        }
        else
            {
                if(y>z)
                {
                    System.out.println("y is largest");
                }
                else
                    {
                        System.out.println("z is largest");
                    }
            }
    }
}
