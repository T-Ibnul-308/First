import java.util.Scanner;
public class Assinw0401d {
    public static void main(String[]args){
        Scanner keyboard =new Scanner(System.in);
        int i=2;
        while(i<=7){
            if(i%2==0){
            System.out.println(9*i);}
            else{
                System.out.println(9*-i);
            }
            i++;
        }
    }
}
