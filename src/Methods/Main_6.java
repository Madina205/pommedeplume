package Methods;
import java.util.Scanner;

public class Main_6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String admin = in.next();
        String password = in.next();
        System.out.println(code (admin, password));
    }

    public static String code (String admin, String password) {
        if (admin.equals("admin") && password.equals("qwerty")) {
            return "YES";
        } else {
            return "NO";
        }
    }
}
