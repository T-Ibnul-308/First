import java.util.Scanner;
public class Xample {
    public static void main(String[]args){
        Scanner keyboard;
        keyboard= new Scanner(System.in);
        System.out.println("enter value");
        float x,y;
        x= keyboard.nextFloat();
        y=keyboard.nextFloat();
        if(x>y){
            System.out.println("diff: "+(x-y));
        }
        else if(y%2==0){
            System.out.println(((y/2)+(x)));
        }
        else{
            System.out.println((y/x));
        }
        while(x<10){
            System.out.println(x);
            x++;
            while(y<20) {
                System.out.println(y);
                y++;
            }
        }
    }
}
