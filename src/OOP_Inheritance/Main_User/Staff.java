package OOP_Inheritance.Main_User;

public class Staff extends User {
    private double salary;

    private String subjects[] = new String[100];

    private int indexOfSubject = 0;

    public Staff(int id, String login, String password, String name, String surname, double salary, String[] subjects, int indexOfSubject) {
        super(id, login, password, name, surname);
        this.salary = salary;
        this.subjects = subjects;
        this.indexOfSubject = indexOfSubject;
    }

    public Staff() {
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }


    public int getIndexOfSubject() {
        return indexOfSubject;
    }

    public void setIndexOfSubject(int indexOfSubject) {
        this.indexOfSubject = indexOfSubject;
    }

    @Override
    public void getData (){
        System.out.println(toString() + salary + " " +  subjects  + " " + indexOfSubject );
    }

    public void addSubject (String subject) {
        subjects[indexOfSubject] = subject;
        indexOfSubject++;
    }
}
