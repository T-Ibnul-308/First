import java .util.Scanner;
public class cAssignment327
{public static void main(String[] args) {
    System.out.print("Enter num,N :");
    Scanner keyboard = new Scanner(System.in);
    int i,j;
    int n=keyboard.nextInt();
    System.out.println("Prime numbers");
   for(i=2;i<=n;i++)
   {int C=0;
       for(j=1;j<=i;j++)
       {
           if(i%j==0){C++;}
       }if(C==2){
       System.out.print(i+" ");}
   }

}
}
