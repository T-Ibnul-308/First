import java .util.Scanner;
public class InputExampleE
{
    public static void main(String[]args)
    {
        Scanner keyboard;
        keyboard= new Scanner(System.in);
        System.out.println("please enter the integers");
        int x,y;
        x= keyboard.nextInt();
        y= keyboard.nextInt();
        if(x>y) {
            System.out.println("First");
        }
    }
}
