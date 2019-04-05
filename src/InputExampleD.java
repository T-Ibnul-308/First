import java.util.Scanner;
public class InputExampleD
{
    public static void main(String[]args)
    {
     Scanner keyboard;
     keyboard=new Scanner(System.in);
        System.out.println("enter the value of radius");
        float r;
        r= keyboard.nextFloat();
        System.out.println("Circumference: "+(2*3.1416*r));
        System.out.println("Area: "+(3.1416*r*r));
    }
}
