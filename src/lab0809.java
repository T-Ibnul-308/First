import java.util.Scanner;
public class lab0809 {
    public static void main(String[]args){
        Scanner keyboard=new Scanner(System.in);
        System.out.println("enter the values :");
        int a[]=new int[10];
        for(int index=0;index<10;index++){
            a[index]=keyboard.nextInt();}
        System.out.println("Please enter a number :");
        int num=keyboard.nextInt();
        int flag=0;
        for(int check=0;check<10;check++){
                if(a[check]==num){
                    flag=1;
                    System.out.println("Yes");
                    break;
                }
            }if(flag==0){
            System.out.println("No");
        }

    }
}


