package Methods;
import java.util.Scanner;


public class Main_17 {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        String znak = in.next();

        Method(n,m, znak);
    }
    public static void Method (int n, int m, String znak) {
        String minus = "-";
        String plus = "+";

        if(znak.equals(minus)){
            System.out.println(n-m);
        }
         else if(znak.equals(plus)){
            System.out.println(n+m);
        }

    }

}
