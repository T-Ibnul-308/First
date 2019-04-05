import java.util.Scanner;

public class cAssignment507 {public static void main(String[] args) {
    Scanner keyboard = new Scanner(System.in);
    int[] marks = new int[]{50, 30, 20, 10, 40};
    int i = 0;
    int backup=0,largest=0,location=0;
    for ( i = 1; i < marks.length; i++) {
        if (marks[i]>largest) {
            largest= marks[i];
            location=i;
        }
    }backup=marks[1];
    marks[1]=largest;
    marks[location]=backup;                 //xx
    for ( i = 0; i < marks.length; i++) {
        System.out.print(marks[i]+" ");}
    System.out.println();                   //xx
    int smallest=0;  //confusion...
    for ( i = 2; i < marks.length; i++) {
        if (marks[i]>smallest) {
            largest= marks[i];
            location=i;
        }
    }
    backup=marks[2];
    marks[2]=largest;
    marks[location]=backup;                  //xx
    for ( i = 0; i < marks.length; i++) {
        System.out.print(marks[i]+" ");}
    System.out.println();                   //xx
    for ( i = 3; i < marks.length; i++) {
        if (marks[i]>smallest) {
            largest= marks[i];
            location=i;
        }
    }
    backup=marks[3];
    marks[3]=largest;
    marks[location]=backup;
    for ( i = 0; i < marks.length; i++) {
        System.out.print(marks[i]+" ");}

}
}
