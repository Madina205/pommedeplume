package Lambda.Main_15;

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

        long multi = numbers.stream()
                .filter(element -> element!=0)
                .reduce(1, (a,b) -> a*b);

        System.out.println(multi);
}
}
