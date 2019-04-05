import java.util.Scanner;
public class check03
{ public static void main(String[] args) {
    Scanner keyboard = new Scanner(System.in);
    double average;
    double i = 1, sum = 0, num;
           double min =(Math.pow(2,31)-1);
          double  max =Math.pow(-2,31);
    System.out.print("Please enter the quantity of numbers you wish to evaluate: ");
    double q=keyboard.nextInt();
        while(i<=q)
    {
        System.out.println("Please enter the number of numbers you wish to evaluate:");
        num = keyboard.nextInt();
        sum += num;
        if (num > max) {
            max = num;
        }
        else{
            if(num < min) {
                    min = num;
            }
        }
        i++;
    }
    average=sum/q;
    System.out.println("Your average is: " + average);
    System.out.println("Your maximum number is: " + max);
    System.out.println("Your minimum number is: " + min);
}
}

