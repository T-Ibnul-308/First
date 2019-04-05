import java.util.Scanner;

public class lab0810 {public static void main(String[]args) {
    Scanner keyboard = new Scanner(System.in);
    System.out.print("Enter the va;ue :");
    int a[] = new int[10];
    for (int i = 0; i < 10; i++) {
        a[i] = keyboard.nextInt();
        for (int j = 0; j <= i; j++) {
            System.out.print(a[j] + " ");
        }

    }
}}
