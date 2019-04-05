import java.util.Scanner;

public class arraylab0909 {
    public static void main(String[] args) {
    Scanner keyboard = new Scanner(System.in);
    int a[] = new int[15];
    System.out.print("Enter the numbers between 0-9 :");
    for(int i=0;i<15;i++) {
            a[i] = keyboard.nextInt();
           for(int j=10;j>9;j++){
               if(a[i]==j){
                   System.out.println("Enter another no.");
                   i--;
                   break;
               }
           }
    }
    for(int i=0;i<=9;i++){
        int times=0;
        for(int c=0;c<15;c++){
                    if(a[c]==i){times+=1;}
                }
        System.out.println(i+" has appeared "+times+" times");
            }

  }
}
