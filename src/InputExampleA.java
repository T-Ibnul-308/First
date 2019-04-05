import java.util.Scanner;

public class InputExampleA
{
    public static void main(String[]args)
    {
        Scanner keyboard;
        keyboard = new Scanner(System.in);
        System.out.println("enter an integer");
        int x;
        x = keyboard.nextInt();
        System.out.println("the integer:" +x);

    }
}
