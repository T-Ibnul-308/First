import java.util.Scanner;
public class cAssignment328 {public static void main(String[] args) {
    System.out.print("Enter num,n :");
    Scanner keyboard = new Scanner(System.in);
    int n = keyboard.nextInt();
    int i = 1,C,sum=0;
    while(i<=n)
    { C=n%i;
        if(C==0){sum+=i;}
        i++;}

    System.out.println(sum);
}
}
