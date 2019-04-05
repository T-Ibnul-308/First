import java.util.Scanner;
public class check2
{
    public static void main(String[]args)
    {
        Scanner keyboard=new Scanner(System.in);
        float i,n,c,sum=0,counter=0;
        System.out.print("Enter start : ");
        i=keyboard.nextFloat();
        System.out.print("Enter term: ");
        n=keyboard.nextFloat();
        while(i<=n)
        {
            System.out.println("Enter quiz marks: ");
            float m=keyboard.nextFloat();
            sum=sum+m;
            i++;
            counter++;
        }
        float v=sum/counter;
        float m,f;
            System.out.print("Enter mid marks : ");
            m=keyboard.nextFloat();
            System.out.print("Enter final marks : ");
            f=keyboard.nextFloat();
        System.out.println("Total marks:"+(+v+m+f));
    }
}
