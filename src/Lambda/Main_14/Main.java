package Lambda.Main_14;

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

        double average = numbers.stream()
                .filter(element -> element%2==0)
                .mapToInt(i->i)
                .average().getAsDouble();

        numbers.stream()
                .filter(number -> number>average)
                .forEach(number -> System.out.println(number));


    }
}
