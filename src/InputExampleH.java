import java.util.Scanner;
public class InputExampleH
{
    public static void main(String[]args)
    {
        Scanner keyboard;
        keyboard= new Scanner(System.in);
        System.out.println("please enter the values");
        int x,y;
        x= keyboard.nextInt();
        y= keyboard.nextInt();
        if(x>y){
            System.out.println("Difference: "+(x-y));
        }
        else{
            System.out.println("Differene: "+(y-x));
        }
    }
}
