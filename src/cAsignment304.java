import java.util.Scanner;
public class cAsignment304
{public static void main(String[] args) {
    Scanner keyboard = new Scanner(System.in);
    int i,sum=0,counter=0;
    double min=Math.pow(2,31)-1;
    System.out.print("enter quantity,q :");
    int q=keyboard.nextInt();
    for(i=0;i<q;i++)
    {
        System.out.println("enter num,n :");
        int n=keyboard.nextInt();
        if(n%2==0)
        {
            sum=sum+n;
            if(n<min){min=n;}counter++;
        }
    }
    System.out.println("min :"+min);
    System.out.println("avg :"+(sum/counter));

}
}
