import java.util.Scanner;
public class Assinw0409
{
    public static void main(String[]args){
    System.out.print("Enter num,n :");
    Scanner keyboard = new Scanner(System.in);
    int n=keyboard.nextInt();
    int i=1,sum=0,divisor;
    while(i<=n) {
        if (n % i == 0) {
            divisor = n / i;
            System.out.println("Divisor" + divisor);
            sum = sum + divisor;
        }

        i++;
    }if(sum==2*n){
            System.out.println("Perfect");
        }else{
            System.out.println("Not Perfect");
        }
 }
}
