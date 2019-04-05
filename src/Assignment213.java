import java.util.Scanner;
public class Assignment213
{
    public static void main(String[]args)
    {
        System.out.print("Enter no of working Hours: ");
        Scanner keyboard= new Scanner(System.in);
        float h;
        h=keyboard.nextFloat();
        if(h<=40)
        {
            System.out.println("Salary: "+(h*200));
        }
        else
            {
                System.out.println("Salary: "+(8000+((h-40)*300)));
            }
    }
}
