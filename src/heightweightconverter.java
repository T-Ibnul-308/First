import java.util.Scanner;

public class heightweightconverter
{public static void main(String[]args)
 {
    Scanner keyboard=new Scanner(System.in);
    System.out.println("Press 1 to convert height");
    System.out.println("Press 2 to convert weight");
    System.out.print("Enter num, N:");
    int N=keyboard.nextInt();
    if(N==1) {
        System.out.print("Enter height in inch, inch :");
        int inch = keyboard.nextInt();
        System.out.println("Enter 1 to get in ft. ");
        System.out.println("Enter 2 to get value in cm .");
        System.out.println("Enter 3 to get value in m .");
        System.out.print("Enter Serial,S :");
        int S = keyboard.nextInt();
        int ft;
        if (inch >= 0) {
            if (S == 1) {
                int F = ft = inch / 12;
                int I = inch % 12;
                System.out.println(F + " ft " + I + " inch.");
            } else if (S == 2) {
                double centimeter = (inch * 2.54);
                System.out.println(centimeter + " cm. ");
            } else if (S == 3) {
                double centimeter = (inch * 2.54);
                double meter = centimeter / 100;
                System.out.println(meter + " m.");
            }
        } else {
            System.out.println("Please enter valid number");
        }
    }
    else if(N==2) {
        System.out.print("Enter weight in kg :");
        int W = keyboard.nextInt();
        System.out.println("Press 1 to convert in gram");
        System.out.println("Press 2 to convert in pound");
        System.out.println("Press 3 to convert in milligram");
        System.out.print("Enter serial,S: ");
        int S = keyboard.nextInt();
        if (W >= 0) {
            if (S == 1) {
                int gram = W * 1000;
                System.out.println(gram + " gm.");
            } else if (S == 2) {
                double pound = W * 2.20;
                System.out.println(pound + " lb.");
            } else if (S == 3) {
                double milligram = W * 1000000;
                System.out.println(milligram + " mg");
            } else {
                System.out.println("Please enter valid number");
            }
        }
    }
 }
}
