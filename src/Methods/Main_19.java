package Methods;
import java.util.Scanner;

public class Main_19 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
         int arr [] = new int[n];

         for (int i= 0; i<n; i++){
             arr[i] = in.nextInt();
         }

         Method(n,arr);
    }

    public static void Method (int n, int arr[]){
        for(int i=0; i<n; i++){
            if(arr[i]<50  && arr[i]%5==0){
                System.out.println(arr[i] + " ") ;
            }
        }
    }
}
