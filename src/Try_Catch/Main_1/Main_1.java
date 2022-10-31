package Try_Catch.Main_1;
import java.util.Scanner;


public class Main_1 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        Users []  users = new Users[5];

        int sum = 0;

        for(int i = 0; i< users.length; i++ ) {
            System.out.println((i + 1) + ". Name : ");
            String name = in.next();
            System.out.println((i + 1) + ". Surname: ");
            String surname = in.next();
            System.out.println((i + 1) + ". Age: ");
            int age;

            try {
                age = in.nextInt();
            } catch (Exception e) {
                age = 0;
            }

            sum = sum + age;
        }
            System.out.println("Average:" + sum / 5);
        }
    }



