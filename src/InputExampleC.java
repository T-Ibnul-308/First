import java.util.Scanner;
public class InputExampleC
{
    public static void main(String[]args)
    {
        Scanner keyboard;
        keyboard= new Scanner(System.in);
        System.out.println("please enter the values");
        float x,y;
        x= keyboard.nextFloat();
        y=keyboard.nextFloat();
        System.out.println("sum: "+(x+y));
        System.out.println("product: "+(x*y));
        System.out.println("difference: "+(x-y));
    }
}
