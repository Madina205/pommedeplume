package Methods;
import java.util.Scanner;

public class Main_13 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String name  = in.next();

        char [] chars =  name.toCharArray();


        System.out.println(Met(name, chars));
    }
    public static int Met (String name, char []chars){
        int num = 0;
        String vowels ="aeuiyo";
        for(int i =0; i<chars.length;  i++) {
                if(vowels.contains(String.valueOf(chars[i]))) {
                num++;
            }
        }
        return num;
    }
}
