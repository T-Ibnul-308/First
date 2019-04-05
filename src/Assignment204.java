import java.util.Scanner;
public class Assignment204
{
    public static void main(String[]args)
    {
        Scanner keyboard= new Scanner(System.in);
        System.out.println("enter the salary and age");
        double salary,age;
        salary=keyboard.nextDouble();
        age=keyboard.nextDouble();
        if(age>=18)
        {
         if(salary>20000)
         {
             System.out.println("Tax: "+((10/100)*salary));
         }
         else if(salary>=10000)
         {
             System.out.println("Tax: "+((5/100)*salary));
         }
         else
             {
                 System.out.println("no Tax");

             }

        }
        else
            {
            System.out.println("no Tax");
            }

    }
}
