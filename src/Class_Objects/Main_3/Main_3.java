package Class_Objects.Main_3;

public class Main_3 {
    public static void main(String[] args) {

    Student st1 = new Student(1,"Ainara","Makhanova",4.0);
    Student st2 = new Student(2,"Ali","Mukhamed",3.9);
    Student st3 = new Student(3,"Bred","Pitt",2.5);
    Student st4 = new Student(4,"Jennifer","Lopez",3.4);
    Student st5 = new Student(5,"Jessica","Alba",3.2);

    Student arr[] = {st1, st2, st3, st4,st5};

    for (int i=0; i< arr.length; i++){
        System.out.println(arr[i]);
    }

}
}
