package Methods;
import java.util.Scanner;

public class Main_12_2version {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String name = in.next();

        System.out.println(Methood(name));
    }

    public static String Methood (String name){
        String slovo = ""; // cоздаем пустое слово

        char ch [] = name.toCharArray();

        for( int i = 0; i< name.length(); i++){
            slovo = slovo + ch[i] + name.charAt(i);


        }
        return slovo;
    }

}

