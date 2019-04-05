import java.util.Scanner;
public class cAssignment320
{public static void main(String[]args) {
    System.out.print("Enter the number,n: ");
    Scanner keyboard = new Scanner(System.in);
    int n = keyboard.nextInt();
    int M;
    M = n % 10;
    System.out.println(M);
    while (n / 10 != 0)
    {n=n/10;
    M=n%10;
        System.out.println(M);
    }
  }
}
