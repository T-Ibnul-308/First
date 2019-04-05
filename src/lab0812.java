import java.util.Scanner;

public class lab0812 {
        public static void main(String[] args) {
            Scanner keyboard = new Scanner(System.in);
            System.out.println("Enter the numbers :");
            int a[] = new int[10];
            int location=0,i;
            for ( i = 0; i < 10; i++) {
                a[i]=keyboard.nextInt();

            }
            for ( i = 9; i>=0; i--) {
                if (a[i] % 2 == 0) {
                    location = i;
                    System.out.print(a[i]);
                    System.out.println(" " + location);

                }

            }System.out.println();

            }
        }

