package Methods;
import java.util.Scanner;

public class Main_1 {
        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            int a = in.nextInt();
            int b = in.nextInt();
            int c = in.nextInt();
            int max = max(a, b, c);
            System.out.println(max);

        }
            public static int max (int a, int b, int c){
                if(a>=b && a>=c) return a;
                else if (b>=a && b>=c) return b;
                else return c;


            }


}
