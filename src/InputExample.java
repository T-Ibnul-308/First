import java.util.Scanner;

public class InputExample {
    public static void main(String[] args) {
        Scanner keyboard=new Scanner(System.in);
        System.out.println("please enter an int");
        int x;
        x=keyboard.nextInt();
        System.out.println(x);
        System.out.println("please enter float");
        float y;
        y=keyboard.nextFloat();
        System.out.println(y);
        System.out.println("please enter a double");
        double c;
        c=keyboard.nextDouble();
        System.out.println(c);
        System.out.println("END");
    }
}
