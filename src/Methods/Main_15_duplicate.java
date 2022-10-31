package Methods;
import java.util.Scanner;

public class Main_15_duplicate {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int arr[]  =  new int[n];

        for(int i =0; i<n; i++){
            arr[i] = in.nextInt();
        }

        Method(n,arr);

    }

    public static void Method (int n, int  arr[]){
    boolean flag  = true;
    for (int i = 0; i<n;  i++){

        flag =true;

        for(int j = 0; j<n; j++){
            if(arr[i]==arr[j] && i!=j){
                flag =  false;
                break;
            }
        }

        if(flag){
            System.out.print(arr[i] + " ");
        }

      }
    }

}
