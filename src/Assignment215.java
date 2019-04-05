import java.util.Scanner;
public class Assignment215
{
    public static void main(String[]args)
    {
        System.out.print("Enter the time/hour: ");
        Scanner keyboard= new Scanner(System.in);
        float h;
        h=keyboard.nextFloat();
        if(h>0)
        {
            if(h>=4)
            {
                if(h>6)
                {
                    if(h>=12)
                    {
                        if(h>13)
                        {
                         if(h>=16)
                         {
                             if(h>17)
                             {
                                 if(h>=19)
                                 {
                                     if(h>20)
                                     {
                                         if(h>23)
                                         {
                                             System.out.println("Wrong time");
                                         }
                                         else{
                                             System.out.println("Patience is a virtue");
                                         }
                                     }
                                     else {
                                         System.out.println("Dinner");
                                     }
                                 }
                                 else{
                                     System.out.println("Patience is a virtue");
                                 }
                             }
                             else{
                                 System.out.println("Snacks");
                             }
                         }
                         else{
                             System.out.println("Patience is a virtue");
                         }
                        }
                        else{
                            System.out.println("Lunch");
                        }
                    }
                    else{
                        System.out.println("Patience is a virtue");
                    }
                }
                else{
                    System.out.println("Breakfast");
                }
            }
            else{
                System.out.println("Patience is a virtue");
            }
        }
        else{
            System.out.println("Wrong Time");
        }
    }
}
