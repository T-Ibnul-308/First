import java.util.Scanner;
public class cAsignment307
{ public static void main(String[]args)
 { Scanner keyboard = new Scanner(System.in);
 int i,sum=0;
 for(i=1;i<=600;i++)
 {
     if(i%7==0){if(i%9==0){sum=sum+i;}}

 }
     System.out.println("Sum :"+sum);
 }

}