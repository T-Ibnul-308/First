import java.util.Scanner;
public class arraylab0908 {
    public static void main(String[]args){
        Scanner keyboard=new Scanner(System.in);
        System.out.print("Enter the num,n :");
        int n=keyboard.nextInt();
        String a[]=new String[10];
        a[0]="Zero";
        a[1]="One";
        a[2]="Two";
        a[3]="Three";
        a[4]="Four";
        a[5]="Five";
        a[6]="Six";
        a[7]="Seven";
        a[8]="Eight";
        a[9]="Nine";
        System.out.println(a[n]);


    }
}
