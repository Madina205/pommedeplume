package Lambda.Main_4_13;

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
//        long x = numbers.stream().reduce(0,(a,b) -> a+b);
//        System.out.println("sum: " + x);

        numbers.stream()
                .filter(index -> index<0)
                .mapToInt(i->i)
                .average()
                .ifPresent(average-> System.out.println("AveragefOdd: "+average));

    }
}

