import java.util.Scanner;
public class Assignment206
{
    public static void main(String[]args)
    {
        Scanner keyboard= new Scanner(System.in);
        System.out.println("Enter the value of S");
        float S;
        S=keyboard.nextFloat();
        if(S<100)
        {
            System.out.println("S: "+(3000-125*S*S));
        }
        else
            {
                System.out.println("S: "+(12000/(4+(S*S/14900))));
            }
    }
}
