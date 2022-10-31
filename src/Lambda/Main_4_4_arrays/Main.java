package Lambda.Main_4_4_arrays;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        ArrayList<Integer> numbers = new ArrayList<Integer>();

        for (int i =0 ; i<n; i++){
            numbers.add(in.nextInt());
        }
        numbers.stream()
                .filter(Integer -> Integer>0)
                .forEach(Integer-> System.out.print(Integer + " "));
    }
}
