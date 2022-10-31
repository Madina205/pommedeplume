package Methods;
import java.util.Scanner;

public class Main_8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int arr[][] = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = in.nextInt();
            }
        }

        System.out.println(ChangeArray(n, arr));

    }

    public static int ChangeArray(int n, int arr[][]) {
        int[] x;
        x = arr[0];
        arr[0] =arr [n-1];
        arr[n-1] = x;

     return arr[n][n];

    }
}
