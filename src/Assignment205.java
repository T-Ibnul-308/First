import java.util.Scanner;
public class Assignment205
{
    public static void main(String[]args)
    {
        System.out.println("enter value ");
        Scanner keyboard=new Scanner(System.in);
        double second;
        second=keyboard.nextDouble();
        System.out.print("Hour: "+((second/60)/60));
        System.out.print(" Minute: "+((second/60)%60));
        System.out.println(" Second:"+(second%60));
        }
    }

