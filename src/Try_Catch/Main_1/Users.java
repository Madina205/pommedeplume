package Try_Catch.Main_1;

public class Users {
    String name;
    String surname;
    int age;

    Users[] users = new Users[5];



    public Users(String name, String surname,int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    public Users() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Users{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                '}';
    }
}
