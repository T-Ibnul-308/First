import java.util.Scanner;
public class cAsignment312
{public static void main(String[]args) {
    Scanner keyboard = new Scanner(System.in);
    int i, sum = 0,counter=0;
    for(i=1;i<=10;i++)
    {
        System.out.println("Enter num,n :");
        int n=keyboard.nextInt();
        if(n%4==0){sum=sum+n;
            counter++;}

    }
    System.out.println("Avg :"+(sum/counter));
    System.out.println("Total :"+sum);
}
}
