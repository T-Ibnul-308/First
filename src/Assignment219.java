import java.util.Scanner;
public class Assignment219
{
    public static void main(String[]args)
    {
        System.out.print("Enter an integer: ");
        Scanner keyboard= new Scanner(System.in);
        int x;
        x=keyboard.nextInt();
        if(x%2==0){
            if(x%5==0){}
            else{
                System.out.println(x);
            }
        }
        else{
            if(x%5==0){
                System.out.println(x);
            }else{}
        }
    }
}
