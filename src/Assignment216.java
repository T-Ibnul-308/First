import java.util.Scanner;
public class Assignment216
{
    public static void main(String[]args)
    {
        Scanner keyboard=new Scanner(System.in);
        System.out.print("Enter the no.: ");
        double N=keyboard.nextDouble();
        System.out.print("Enter hour: ");
        double H=keyboard.nextDouble();
        System.out.print("Enter minute: ");
        double M=keyboard.nextDouble();
        System.out.print("Enter F&F no.1=yes/0=no : ");
        double F=keyboard.nextDouble();
        System.out.print("Enter the peak hour: ");
        double P=keyboard.nextDouble();
        if(F==1)
        {
            if(H==P){
                if(M>5){
                    System.out.println("Charge: "+(5*4+(M-5)*2));
                }
                else{
                    System.out.println("Charge: "+(4*M));
                }
            }
            else{
                if(M>5){
                    System.out.println("Charge: "+(5*3+(M-5)*1));
                }
                else{
                    System.out.println("Charge: "+3*M);
                }
            }
        }
        else if(F==0){
            if(H==P){
                if(M>5){
                    System.out.println("Charge: "+(5*7+(M-5)*6));
                }
                else{
                    System.out.println("Charge: "+(7*M));
                }
            }
            else{
                if(M>5){
                    System.out.println("Charge: "+(5*8+(M-5)*5));
                }
                else{
                    System.out.println("Charge: "+5*M);
                }
            }
        }
        else{}
    }
}
