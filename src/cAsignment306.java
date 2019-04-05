import java.util.Scanner;
public class cAsignment306
{public static void main(String[] args)
{
    Scanner keyboard = new Scanner(System.in);
    int i,sum=0;
    System.out.print("enter last term,n :");
    int n=keyboard.nextInt();
    for(i=1;i<=n;i++) {
        if (i % 2 == 0) {

                sum = sum + i * i * -1;
            }
            else
            {sum=sum+i*i;}

    }System.out.println("Y :"+sum);
}
}
