import java.util.Scanner;
public class cAssignment324
{
    public static void main(String[]args)
    {
        System.out.print("Enter value of n: ");
        Scanner keyboard=new Scanner(System.in);
        int n=keyboard.nextInt();
        int i=1;
        while(i<=n){
            System.out.println(i);
            i++;
        }
    }
}
