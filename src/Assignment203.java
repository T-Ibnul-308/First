import java.util.Scanner;
public class Assignment203
{
    public static void main(String[]args)
    {
        Scanner keyboard= new Scanner(System.in);
        System.out.println("enter the Grades");
        float grade1;
        grade1=keyboard.nextFloat();
        float grade2;
        grade2=keyboard.nextFloat();
        float grade3;
        grade3=keyboard.nextFloat();
        float grade4;
        grade4=keyboard.nextFloat();
        {if(grade1<=4)
            {
            if(grade2<=4)
            {
                if(grade3<=4)
                {
                    if(grade4<=4)
                    {
                        System.out.println("GPA: "+((grade1*3+grade2*0+grade3*3+grade4*3)/(3+0+3+3)));
                    }
                    else
                    {
                        System.out.println("Wrong value");
                    }
                }
                else
                {
                    System.out.println("Wrong value");
                }
            }
            else
            {
                System.out.println("Wrong value");
            }
            }
         else
            {
            System.out.println("Wrong value");
            }
        }
    }
}
