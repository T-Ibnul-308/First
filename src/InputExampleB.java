import java.util.Scanner;
public class InputExampleB
{
    public static void main(String[]ags)
    {
        Scanner keyboard;
        keyboard= new Scanner(System.in);
        System.out.println("please enter the integers");
        int x,y;
        x=keyboard.nextInt();
        y=keyboard.nextInt();
        System.out.println("sum:" +(x+y));
        System.out.println("product:" +(x*y));
        System.out.println("difference:" +(x-y));
    }
}
