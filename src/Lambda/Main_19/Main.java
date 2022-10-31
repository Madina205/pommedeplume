package Lambda.Main_19;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        ArrayList<Integer> numbers = new ArrayList<Integer>();

        for (int i = 0; i < n; i++) {
            numbers.add(in.nextInt());
        }

        int min = numbers.stream()
                .min(Integer:: compareTo).get();

        System.out.println(min*min);
 }
}
