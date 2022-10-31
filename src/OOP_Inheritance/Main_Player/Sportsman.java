package OOP_Inheritance.Main_Player;

public class Sportsman {
    String fullName;

    int age;

    String country;

    public Sportsman(String fullName, int age, String country) {
        this.fullName = fullName;
        this.age = age;
        this.country = country;
    }

    public Sportsman() {
    }

    public void play () {
        System.out.println("Sportsman  "  + toString()  + " is  playing");
    }

    public String toString (){
        return fullName + " "  + age + " " + country;
    }


}
