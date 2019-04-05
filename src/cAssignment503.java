import java.util.Scanner;

public class cAssignment503 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int[] marks = new int[]{10, 30, 20, 50, 40};
        int i = 0;
        int location=0,largest=0;
        for ( i = 0; i < marks.length; i++) {
                if (marks[i]>largest) {
                   largest= marks[i];
                    location=i;
                }
        }
        System.out.println("Largest number is :"+largest);
        System.out.println("Largest number found at "+location);
    }
}

