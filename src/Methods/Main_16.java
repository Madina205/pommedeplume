package Methods;
import java.util.Scanner;

public class Main_16 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int [] nums = new int[n];

        for ( int i = 0;  i<nums.length;i++){
            nums[i] = in.nextInt();
        }

        Method(n, nums);
    }

    public static void Method (int n, int nums[]){
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for ( int i = 0;  i<nums.length;i++){
            if(max<nums[i]){
                max=nums[i];
            }
        }
        System.out.println(max);

        for ( int i = 0;  i<nums.length;i++){
            if(min>nums[i]){
                min=nums[i];
            }
        }
        System.out.println(min);

    }
}

