public class Scope {
    public static void main(String[]args)
    {
        int x;
        x=10;
        {
            int y=20;
            System.out.println(x+y);
        }
        int y;
        y=100;
        x=200;
        System.out.println(x+y);
    }
}
