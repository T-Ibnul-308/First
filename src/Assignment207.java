import java.util.Scanner;
public class Assignment207
{
    public static void main(String[]args)
    {
     Scanner keyboard=new Scanner(System.in);
        System.out.println("enter the values");
        float x,y,z;
        x=keyboard.nextFloat();
        y=keyboard.nextFloat();
        z=keyboard.nextFloat();
        float S=((x+y+z)/2);
        {System.out.println("Area: "+(Math.sqrt(S*(S-x)*(S-y)*(S-z))));}
    }
}
