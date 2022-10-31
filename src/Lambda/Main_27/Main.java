package Lambda.Main_27;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        ArrayList<Integer> numbers = new ArrayList<Integer>();

        for (int i =0; i<n; i++){
            numbers.add(in.nextInt());
        }

        int max = numbers.stream()
                .max(Integer:: compareTo).get();


        int min = numbers.stream()
                .min(Integer:: compareTo).get();


        for (int i =0; i<n; i++){
            max = min;
            min = max;

        }

        System.out.println(numbers.toString());







    }
}
