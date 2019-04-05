import java.util.Scanner;

public class cAssignment506 {public static void main(String[] args) {
    Scanner keyboard = new Scanner(System.in);
    System.out.print("Enter quantity,q :");
    int q = keyboard.nextInt();
    int num[]=new int[q];
    System.out.println("Enter the marks :");
    for ( int i = 0; i < num.length; i++) {
        num[i]=keyboard.nextInt();
    }
    int temp=0;
    for ( int i = 0; i < num.length; i++) {
        for(int j=0;j<num.length;j++){
            if(num[i]<num[j]){
                temp=num[i];
                num[i]=num[j];
                num[j]=temp;
            }
        }
    }for ( int i = 0; i < num.length; i++) {
    System.out.print("Heighest number :"+(num[num.length-1]));
    break;}
 }
}
