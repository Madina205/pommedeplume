package Lambda.Example;

public class Main {
    public static void main(String[] args) {
        MathOperation operation = (a,b) -> a+b;
        System.out.println(operation.operate(30,40));
        System.out.println(operation.operate(100,200));
    }
}
