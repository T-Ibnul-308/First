import java.util.Scanner;
public class tracing2
{public static void main(String[]args)
{
    Scanner keyboard=new Scanner(System.in);
    int n=keyboard.nextInt();
    int i=2;
    while(i<=n-1)
    {if(n%i==0)
    {
        System.out.println("not Prime");
        break;
    }
    else{i++;}
    }
    if(i==n){
        System.out.println("Prime no");
    }
}
}
