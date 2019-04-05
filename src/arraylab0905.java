import java.util.Scanner;

public class arraylab0905 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter the numbers :");
        int a[] = new int[5];
        int largest=0;

        for(int i=0;i<5;i++){
            a[i]=keyboard.nextInt();
        }
        int i,j,temp=0;
        for(i=0;i<5;i++) {
            for (j = 0; j < 5; j++) {
                if (a[i] > a[j]) {
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
        for(i=0;i<5;i++){
            System.out.print(a[i]);
                    if(i<4){
                        System.out.print(",");
                    }
                }



    }
}

