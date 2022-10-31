package Methods;
import java.util.Scanner;

public class Main_5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str1= in.next();
        String str2 = in.next();
        System.out.println(code(str1, str2));
    }
    public static String code (String str1, String str2) {
        if (str1.contains(str2)) {
            return ("YES");
        } else {
            return ("NO");
        }
    }
}
