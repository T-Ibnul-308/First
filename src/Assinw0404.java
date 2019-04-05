import java.util.Scanner;
public class Assinw0404 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int i = 1, sum = 0;
        while (i <= 600) {
            if (i % 7 == 0) {
                if (i % 9 != 0) {
                    sum = sum + i;
                }
            } else if (i % 9 == 0) {
                sum = sum + i;
            }
            i++;
        }
        System.out.println(sum);
    }
}