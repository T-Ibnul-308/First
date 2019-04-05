import java.util.Scanner;
public class Assinw0405 {public static void main(String[] args) {
    Scanner keyboard = new Scanner(System.in);
    int i = 1, n=20;
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
