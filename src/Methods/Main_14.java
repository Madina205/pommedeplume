package Methods;
import java.util.Scanner;

public class Main_14 {
    public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    int[] nums = new int[n];

    for(int i = 0; i<nums.length; i++){
        nums[i] = in.nextInt();
    }
        System.out.println(Method(n,nums));
    }

    public static int Method (int n, int nums[]){
        int count = 0;
        for(int i = 0; i<nums.length; i++){
            if (nums[i] != 0) {
                count ++;
            }
            }
        return count;
    }
}
