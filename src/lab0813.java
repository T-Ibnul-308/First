import java.util.Scanner;

public class lab0813 {
    public static void main(String[] args) {
    Scanner keyboard = new Scanner(System.in);
    System.out.println("Enter the numbers :");
    int a[] = new int[10];
    int location=0,i;
    int sum=0,counter=0;
    for ( i = 0; i < 10; i++) {
        a[i]=keyboard.nextInt();
        if(a[i]%2==0){sum+=a[i];}
        else{}

    }System.out.println("Even num :"+sum);
        int Odsum=0;
        for ( i = 0; i < 10; i++) {
            if(a[i]%2!=0){Odsum+=a[i];}
            else{}
        }System.out.println("Odd num :"+Odsum);
        int _5sum=0,C=1;
        for ( i = 0; i < 10; i++) {
            if(a[i]%5==0){_5sum+=a[i];C++;}
            else{}
        }System.out.println("Odd num :"+(_5sum/C));
        //AnsSheshEikhane
        for ( i = 9; i>=0; i--) {
            if (a[i] % 2 == 0) {
                location = i;
                System.out.print(a[i]);
                System.out.println(" " + location);

            }
        }for ( i = 9; i>=0; i--) {
             if (a[i] % 2 != 0) {
                location = i;
                System.out.print(a[i]);
                System.out.println(" " + location);

            }
        }for ( i = 9; i>=0; i--) {
            if (a[i] % 5 == 0){
                location = i;
                System.out.print(a[i]);
                System.out.println(" " + location);

            }
        }


    }
}
