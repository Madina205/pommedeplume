package Methods;
import java.util.Scanner;

public class Main_2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
     //   int triangle = triangle (a,b,c);
        System.out.println(triangle(a,b,c));
    }
    public static String triangle (int a, int b, int c){
        if (a+b>=c && a+c>=b && b+c>=a){
            return "YES";
        }
        else return  "NO";
    }
}

