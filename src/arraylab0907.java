import java.util.Scanner;

public class arraylab0907 { public static void main(String[] args) {
     Scanner keyboard = new Scanner(System.in);
     System.out.print("Enter the num of numbers :");
     int k=keyboard.nextInt();
     int a[] = new int[k];
     int largest = 0;
     int sum;
     for (int i = 0; i < k; i++) {
        a[i] = keyboard.nextInt();
     }
     int i, j, temp = 0;
     //lagbona.
     for (i = 0; i < k; i++) {
        for (j = 0; j < k; j++) {
            if (a[i] < a[j]) {
                temp = a[i];
                a[i] = a[j];
                a[j] = temp;
            }
        }
     }//attuklagbona.
       for (i = 0; i < k; i++) {
                if (i % 2 == 0) {
                    System.out.print(a[i]+" ");
                     }
        }
        for (i = 0; i < k; i++) {
                 if (i % 2 != 0) {
                 System.out.print(a[i]+" ");

                 }
        }
   }

}
