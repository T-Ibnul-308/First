import java.util.Scanner;
public class cAsignment301 {
    public static void main(String[] args) {
        System.out.println("Enter name of fav car,n:");
        Scanner keyboard=new Scanner(System.in);
        String n=keyboard.next();
        System.out.println("Enter num,num:");
        int i=0;
        while(i<4){
            System.out.println("Fav car :"+n);
            i++;
        }
    }
}