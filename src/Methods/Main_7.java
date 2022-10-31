package Methods;
import java.util.Scanner;

public class Main_7 {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        int num = in.nextInt();
        int arr[] = new int[num];

        for (int i =0; i<arr.length; i++){
            arr[i] = in.nextInt();
        }
        System.out.println(AverageofEven(num, arr));
    }

    public static int AverageofEven ( int num , int arr[]){
       int sum = 0;
       int count = 0;

        for (int i =0; i<arr.length; i++){
            if(arr[i]%2==0){
                count ++;
                sum = sum + arr[i];
            }
        }
        return (sum/count);

    }
}
