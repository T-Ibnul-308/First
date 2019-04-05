import java.util.Scanner;
public class Assinw0407 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        double i = 1,sum=0;
        double Max=Math.pow(-2,31);
        double Min=Math.pow(2,31)-1;
        System.out.print("Enter Quantity,q :");
        double q=keyboard.nextDouble();
        while (i<=q) {
            System.out.print("Enter the number,num: ");
            double num=keyboard.nextDouble();
            sum=sum+num;
            if (num>Max){
                Max=num;
            }
            else if(num<Min){
                Min=num;
            }
            i++;
        }
        System.out.println("Max :"+Max);
        System.out.println("Min :"+Min);
        System.out.println("Avg :"+(sum/q));

    }
}
