import java.util.Scanner;
public class cAsignment305
{public static void main(String[] args)
{
    Scanner keyboard = new Scanner(System.in);
    int i,sum=0;
    System.out.print("enter last term,n :");
    int n=keyboard.nextInt();
    for(i=1;i<=n;i++){sum=sum+i*i*i;}
    System.out.println("Y*Y*Y :"+sum);

}
}
