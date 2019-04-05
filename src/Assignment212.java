import java.util.Scanner;
public class Assignment212
{
    public static void main(String[]args)
    {
        System.out.println("Enter the values");
        Scanner keyboard =new Scanner(System.in);
        int a,b,c,d,e;
        a=keyboard.nextInt();
        b=keyboard.nextInt();
        c=keyboard.nextInt();
        d=keyboard.nextInt();
        System.out.println(e=a);
        System.out.println("a: "+(a=b));
        System.out.println("b: "+(b=c));
        System.out.println("c: "+(c=d));
        System.out.println("d: "+(d=e));
    }
}
