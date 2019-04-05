import java.util.Scanner;

public class cAssignment504 {public static void main(String[] args) {
    Scanner keyboard = new Scanner(System.in);
    int[] marks = new int[]{10,30,20,50,40};
    int i = 0;
    int backup=0,largest=0,location=i;
    for ( i = 0; i < marks.length; i++)
    {
            if (marks[i]>largest) {
                largest=marks[i];
                location=i;}
    }
    backup=marks[0];
    marks[0]=largest;
    marks[location]=backup;
    for ( i = 0; i < marks.length; i++) {
    System.out.print(marks[i]+" ");}
    }
}
