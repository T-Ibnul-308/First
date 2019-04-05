import java.util.Scanner;
public class Assinw0406
{
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int i = 1;
        System.out.print("Enter Quantity,n :");
        int n=keyboard.nextInt();
        while (i<=n) {
            System.out.print("Enter the number,num: ");
            int num=keyboard.nextInt();
            if (num % 2 == 0) {
                System.out.println("Even num :"+num);
            }
            else{
                System.out.println("Odd num :"+num);
            }
            i++;
        }

    }
}
