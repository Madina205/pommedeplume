package Methods;
import java.util.Scanner;

public class Main_3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String word = in.next();
        String letter = in.next();
        System.out.println(count(word, letter));
    }

    public static int count ( String word, String letter) {
        int number = 0;
        for(int i = 0; i<word.length(); i++){
            if(word.charAt(i)==letter.charAt(0))
            number++;
        }
        return number;
    }
}

