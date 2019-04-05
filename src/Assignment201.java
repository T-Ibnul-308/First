import java.util.Scanner;
public class Assignment201 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter marks ");

        double marks;
        marks = keyboard.nextDouble();
        if (marks > 50) {
            System.out.println("Pass");
        } else {
            System.out.println("You shall not pass");
        }
    }
}
