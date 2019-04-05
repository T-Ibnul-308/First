import java.util.Scanner;
public class cAssignment322
{ public static void main(String[] args)
{
    System.out.print("Enter number,N: ");
    Scanner keyboard = new Scanner(System.in);
    int N = keyboard.nextInt();
    if(N==1){
        System.out.println("one");
    }
    else if(N==2){
        System.out.println("two");
    }
    else if(N==3){
        System.out.println("three");
    }
    else if(N==4){
        System.out.println("four");
    }
    else if(N==5){
        System.out.println("five");
    } else if(N==6){
        System.out.println("six");
    } else if(N==7){
        System.out.println("seven");
    } else if(N==8){
        System.out.println("eight");
    } else if(N==9){
        System.out.println("nine");
    } else if(N==0){
        System.out.println("zero");
    }
}
}
