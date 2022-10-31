package Class_Objects.Main_3;

public class Student {
    int id;

    String name;

    String surname;

    public double gpa;

    public Student (int id, String name, String surname, double gpa){
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.gpa = gpa;

    }

    public Student(){
    }

    public Student ( String name, String surname, double gpa){
        this.name = name;
        this.surname = surname;
        this.gpa = gpa;

    }

    public String getDataWithoutId (){ return name + " " + surname + " " + gpa;}

    public String toString(){
        return id + " " + name + " " + surname + " " + gpa;
    }
}
