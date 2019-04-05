import java.util.Scanner;

public class cAssignment505 {public static void main(String[] args) {
    Scanner keyboard = new Scanner(System.in);
    int[] marks = new int[]{50,30,10,20,40};
    int i = 0;
    int backup=0;
    for ( i = 0; i < marks.length; i++) {
        for(int j=0;j<marks.length;j++){
        if (marks[i]>marks[j]) {
            backup=marks[i];
            marks[i]=marks[j];
            marks[j]=backup;}
        }
    }
    for ( i = 0; i < marks.length; i++) {
        System.out.println(marks[i]+" is at Location "+i);
    }

 }
}
