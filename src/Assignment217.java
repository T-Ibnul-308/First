import java.util.Scanner;
public class Assignment217
{
    public static void main(String[]args)
    {
        System.out.print("Enter an integer: ");
        Scanner keyboard=new Scanner(System.in);
        int x=keyboard.nextInt();
        if(x%2==0){
            if(x>10){
                System.out.println("An even no Greater than 10");
            }
            else{
                System.out.println("An even no less than 10");
            }
        }
        else{
            if(x>10){
                System.out.println("An odd no greater than 10");
            }
            else{
                System.out.println("An odd no less than 10");
            }
        }
    }
}
