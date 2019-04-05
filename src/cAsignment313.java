import java.util.Scanner;
public class cAsignment313 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int i, sum = 0;
        System.out.println("Enter num,n :");
        int n = keyboard.nextInt();
        for (i = 1; i <= n; i++) {
            if (i % 2 != 0) {
                sum = sum + i;
            }
        }
        System.out.println("Sum :" + sum);

    }
}
