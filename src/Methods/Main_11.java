package Methods;
import java.lang.reflect.Method;
import java.util.Scanner;


public class Main_11 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        Method(n);

    }
    public static void Method(int n) {
        if(n%2==0){
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
