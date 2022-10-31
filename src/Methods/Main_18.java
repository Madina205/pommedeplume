package Methods;
import java.sql.SQLOutput;
import java.util.Scanner;

public class Main_18 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int[][] arr = new int [n][m];

        for (int i = 0; i<n; i++){
            for( int j  =0; j<m; j++){
                arr[i][j] = in.nextInt();
            }
        }

        Method(n,m,arr);
    }

    public static void Method (int n, int m , int arr[][]){
        int max =  Integer.MIN_VALUE;
        for (int i = 0; i<n; i++){
            max =  Integer.MIN_VALUE;
            for( int j  =0; j<m; j++){
                if(max<arr[i][j]){
                    max = arr[i][j];
                }
            }
            System.out.println(max);
        }
        System.out.println();
    }
}
