import java.util.Scanner;
public class InputExampleG
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
            System.out.println("first is greater");
        }
        else if(x<y){
            System.out.println("second is greater");
        }
        else{
            System.out.println("the numbers are equal");
        }
    }
}
