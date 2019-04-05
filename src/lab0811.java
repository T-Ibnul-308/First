import java.util.Scanner;
public class lab0811 {
    public static void main(String[]args) {
    Scanner keyboard=new Scanner(System.in);
    System.out.println("Enter the numbers :");
    int a[]=new int [5];
    int temp=0;
    for(int i=0;i<5;i++){
        a[i]=keyboard.nextInt();
        for(int j=0;j<i;j++){
            if(a[i]==a[j]){
                System.out.println("Enter another num.");
                i--;
                break;
            }
        }
    }
 }
}
