package Methods;
import java.util.Scanner;

public class Main_4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String palindrome = in.next();
        String ans = "";
        for (int i = palindrome.length() - 1; i >= 0; i--) {
            ans += palindrome.charAt(i);
        }
            if(ans.equals(palindrome)){
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }


