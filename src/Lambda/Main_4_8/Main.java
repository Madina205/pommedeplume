package Lambda.Main_4_8;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        ArrayList<Integer> numbers = new ArrayList<Integer>();

        for ( int i =0; i<n; i++){
            numbers.add(in.nextInt());
        }

        IntStream.range(0,numbers.size())
                .filter(i-> i%2 !=0)
                .mapToObj(i->numbers.get(i))
                .forEach(element-> System.out.println(element));
    }
}

