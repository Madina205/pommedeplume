package Methods;
import java.util.Scanner;

public class Main_9 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int [] arr = new int[n];

        for (int i = 0; i<n; i++){
            arr[i] = in.nextInt();
        }

        number(n, arr);
    }

    public  static void number (int n, int arr[]) {
        for (int i = 0; i < n; i++) {
            if (arr[i] == 23) {
                break;
            }
            if (arr[i] % 2 != 0) {
                System.out.println(arr[i]);
            }
        }
    }
}
