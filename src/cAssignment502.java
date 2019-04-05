import java.util.Scanner;
public class cAssignment502 {
    public static void main(String[]args){
        Scanner keyboard=new Scanner(System.in);
        int []marks=new int[]{10,30,20,50,40};
        int temp=0,sum=0;
        for(int i=0;i<marks.length;i++){
            for(int j=0;j<marks.length;j++){
                if(marks[i]<marks[j]){
                    temp=marks[i];
                    marks[i]=marks[j];
                    marks[j]=temp;
                }
            }

        }
        for(int i=0;i<marks.length;i++){sum+=marks[i];}
        int avg=sum/marks.length;
        int counter=0;
        for(int i=0;i<marks.length;i++) {
            if (marks[i] > avg) {counter++;

            }
        }System.out.println(counter+" students are better than average.");
        System.out.println("They received following marks :");
        for(int i=0;i<marks.length;i++) {
            if (marks[i] > avg) {
                System.out.println(marks[i]);

            }
        }
    }
}
