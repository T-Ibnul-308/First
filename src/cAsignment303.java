import java.util.Scanner;
public class cAsignment303
{public static void main(String[] args)
{
    Scanner keyboard=new Scanner(System.in);
    int i=1,sum=0;
    int max=(int)Math.pow(-2,31);
    System.out.print("enter the quantity,q:");
    int q=keyboard.nextInt();
    while(i<=q)
    {
        System.out.print("enter num,n:");
        int n=keyboard.nextInt();
        if(n>max){max=n;
        }sum=sum+n;i++;
    }
    System.out.println(max);
    System.out.println("Avg :"+(sum/q));
}
}
