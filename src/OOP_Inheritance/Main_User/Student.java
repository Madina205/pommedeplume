package OOP_Inheritance.Main_User;

public class Student extends User {
    private double gpa;

    private String courses[] = new String[100];

    private int indexOfCourses = 0;

    public Student(int id, String login, String password, String name, String surname, double gpa, String[] courses, int indexOfCourses) {
        super(id, login, password, name, surname);
        this.gpa = gpa;
        this.indexOfCourses = indexOfCourses;
    }

    public Student() {
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }


    public int getIndexOfCourses() {
        return indexOfCourses;
    }

    public void setIndexOfCourses(int indexOfCourses) {
        this.indexOfCourses = indexOfCourses;
    }

    @Override
    public void getData (){
        System.out.println(toString() + gpa + " " +  courses  + indexOfCourses );
    }

    public void addCourse (String course) {
       courses[indexOfCourses] = course;
        indexOfCourses++;
    }
}



