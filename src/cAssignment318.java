import java.util.Scanner;
public class cAssignment318
{
    public static void main(String[]args)
    {
        System.out.print("Enter number,N: ");
        Scanner keyboard= new Scanner(System.in);
        int N=keyboard.nextInt();
        int counter=0;
        while(N !=0)
        {
           N /=10;
           counter++;
        }
        System.out.println("Digits: "+counter );

        }

    }