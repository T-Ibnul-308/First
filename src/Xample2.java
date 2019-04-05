import java.util.Scanner;
public class Xample2 {
    public static void main(String[]args){
        Scanner keyboard;
        keyboard= new Scanner(System.in);
        System.out.println("enter value");
        int x,y;
        x= keyboard.nextInt();
        y=keyboard.nextInt();
        if(x>y){
            System.out.println("diff: "+(x-y));
        }
        else if(y%2==0){
            System.out.println(((y/2)+(x)));
        }
        else{
            System.out.println((y/x));
        }
        while(true){

            if(x<10)
            {
                System.out.println("x: "+x);
                x++;
            }

            if(y<30)
            {
                System.out.println("y: "+y);
                y++;
            }
            else break;


        }
    }
}
