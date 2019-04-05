import java.util.Scanner;

public class Assinw0411b {public static void main(String[] args) {

    Scanner keyboard = new Scanner(System.in);

    for (int n = 41; n < 50; n++)
    {
        int counter=0;
        for(int i=1;i<=n;i++){

        if(n%i==0){counter++;}
    }
    if(counter==2){System.out.println("Prime no."+n);}
    else{
    }
    }

}
}
