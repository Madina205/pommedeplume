package Class_Objects.Main_4;
import Class_Objects.Main_3.Student;


public class Main_4 {
    public static void main(String[] args) {

        Student st1 = new Student(1,"Ainara","Mussina",4.0);
        Student st2 = new Student(2,"Ali","Mukhamed",3.9);
        Student st3 = new Student(3,"Bred","Pitt",2.5);
        Student st4 = new Student(4,"Jennifer","Lopez",3.4);
        Student st5 = new Student(5,"Jessica","Alba",3.2);
        Student st6 = new Student(6,"Jes","Alkion",3.2);
        Student st7 = new Student(7,"Alba","Ashkenazi",3.2);
        Student st8 = new Student(8,"Madi","Rashidov",3.2);
        Student st9 = new Student(9,"Rayan","Bratan",4.0);
        Student st10 = new Student(10,"Aybek","Bagit",3.8);

        Student arr[] = {st1, st2, st3, st4,st5,st6,st7,st8,st9,st10};

        System.out.println(topStudent(arr).toString());



    }
    public static Student topStudent(Student[] arr){
        Student max = arr[0];
        for (int i=1; i< arr.length; i++){
            if(max.gpa<arr[i].gpa){
                max.gpa=arr[i].gpa;
            }
        }
        return max;
    }
}

