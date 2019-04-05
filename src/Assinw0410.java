import java.util.Scanner;
public class Assinw0410
{
    public static void main(String[] args) {
        System.out.print("Enter num,n :");
        Scanner keyboard = new Scanner(System.in);
        int n = keyboard.nextInt();
        int i = 1,counter=0,M=0;
        for(i=1;i<=n;i++)
        { M=n % i;
            if(M==0){counter++;}
            }
        if(counter==2){
            System.out.println("Prime");}
        else{System.out.println("not prime");
                }
        }
    }

