package Lambda.Main_24;
import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        ArrayList<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            numbers.add(in.nextInt());
        }

        int k = in.nextInt();
//
//        numbers.stream()
//                .filter(i->i==k)

//        IntStream.range(0, numbers.size())
//                .filter(i -> i % 2 == 0)
//                .mapToObj(i -> numbers.get(i))
//                .forEach(x-> System.out.println(x));
////                .
    }
}