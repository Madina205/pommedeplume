package Methods;
import java.util.Scanner;

public class Main_12 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String name = in.next();

        System.out.println(Methood(name));
    }
    public static String Methood (String name){
        String slovo = "";

        for( int i = 0; i< name.length(); i++){
            slovo = slovo + name.charAt(i) +  String.valueOf(name.charAt(i));

        }
        return slovo;
    }

}
