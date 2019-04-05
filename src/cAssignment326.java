import java.util.Scanner;
public class cAssignment326
{public static void main(String[] args) {
    System.out.print("Enter num,n :");
    Scanner keyboard = new Scanner(System.in);
    int n = keyboard.nextInt();
    int i,counter=0;
    for(i=1;i<=n;i++)
    {
    if(n%i==0){counter++;}
    }
        if(counter==2)
        {System.out.println("Prime no.");}
        else{
            System.out.println("not prime");
        }




}
}
