package Class_Objects.Main_5;
import java.util.Scanner;
import Class_Objects.Main_3.Student;


public class Main_5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Student [] Students  =  new Student[100];

        int index = 0;
        while(true){
            System.out.println("PRESS [1] TO ADD STUDENT");
            System.out.println("PRESS [2] TO LIST STUDENT");
            System.out.println("PRESS [0] TO EXIT");
            int num = in.nextInt();
             if(num==1){
                 System.out.println("Insert name? ");
                 String name = in.next();
                 System.out.println("Insert surname?");
                 String surname = in.next();
                 System.out.println("Insert GPA?");
                 double gpa = in.nextDouble();
                 Students [index] = new Student(name,surname,gpa);
                 index++;
             }
             else if (num ==2){
                 for (int i=0; i< index; i++){
                     System.out.print(index+1 + " ) " );
                     System.out.println(Students[i].getDataWithoutId());
                 }
             }
             else if(num==0){
                     break;
                 }
            }
        }
    }


