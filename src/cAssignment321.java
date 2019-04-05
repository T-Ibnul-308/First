import java.util.Scanner;
public class cAssignment321 {
    public static void main(String[] args) {
        System.out.print("Enter number,N: ");
        Scanner keyboard = new Scanner(System.in);
        int N = keyboard.nextInt();
        int C=N;
        int counter = 0,B;
        while (N != 0) {
            counter++;
            N/=10;}
        int A=(int)Math.pow(10,counter-1);
            while(C!=0){
            B=C/A;
            System.out.println(B);
                C=C%A;
                A/=10;
           }

    }
}


