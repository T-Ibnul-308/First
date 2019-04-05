import java.util.Scanner;
public class cAsignment314 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter quantity,q :");
        int q = keyboard.nextInt();
        int i, product = 1;
        for (i = 1; i <= q; i++) {
            System.out.print("Enter num,n :");
            int n = keyboard.nextInt();
            if(n>0){product=product*n;}
        }
        System.out.println("Product :"+product);
    }
}