package OOP_Encapsulation.Lecture;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Human h = new Human("Madina", 26, 165);
        System.out.println(h.getName());
        System.out.println(h.getAge());
        System.out.println(h.getHeight());
        h.setAge(-10);

    }
}
