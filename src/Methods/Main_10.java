package Methods;
import java.util.Scanner;

public class Main_10 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int [] arr = new int[n];

        for (int i = 0; i<n ; i++ ){
            arr[i] = in.nextInt();
        }
        System.out.println(Method(n,arr));
    }
    public static int Method (int n, int [] arr){
       int sum = 0;
        for(int i = 0;  i<arr.length; i++){
            if(arr[i]%5!=0){
                sum = sum +arr[i];
            }
        }
        return sum;
    }
}
