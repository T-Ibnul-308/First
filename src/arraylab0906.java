import java.util.Scanner;

public class arraylab0906 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter the numbers :");
        int k=keyboard.nextInt();
        int a[] = new int[k];
        int largest = 0;
        int sum;
        for (int i = 0; i < k; i++) {
            a[i] = keyboard.nextInt();
        }
        int i, j, temp = 0;
        for (i = 0; i < k; i++) {
            for (j = 0; j < k; j++) {
                if (a[i] > a[j]) {
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        } for ( i = 0; i < k; i++) {
            if(k%2==0){
               sum=a[k/2]+a[(k/2)-1];
                System.out.print("Median "+(sum/2));
                break;
            }else{
                System.out.print("Median "+a[(k-1)/2]);
                break;
            }
        }
    }
}
