import java.util.Scanner;
public class Assignment211
{
    public static void main(String[]args)
    {
        System.out.println("Enter the value");
        Scanner keyboard= new Scanner(System.in);
        double x,y;
        x=keyboard.nextDouble();
        y=keyboard.nextDouble();
        System.out.println("x: "+x);
        System.out.println("y: "+y);
        double z;
        System.out.println(z=x);
        System.out.println("x: "+(x=y));
        System.out.println("y: "+(y=z));
    }
}
