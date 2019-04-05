import java.util.Scanner;
public class Assignment210 {
public static void main(String[]args)
{
    System.out.print("Enter the name of favourite car:");
    Scanner keyboard=new Scanner(System.in);
    String carName;
    carName=keyboard.next();
    int i =0;
    while(i<4)
    {
        System.out.println(carName);
        i++;
    }
}
}
