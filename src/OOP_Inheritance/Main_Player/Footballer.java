package OOP_Inheritance.Main_Player;

public class Footballer extends Sportsman {
    String position;

    String club;

    public Footballer(String fullName, int age, String country, String position, String club) {
        super(fullName, age, country);
        this.position = position;
        this.club = club;
    }

    public Footballer() {}

    @Override
    public void play(){
        System.out.println("Footballer  "  + toString()  + " is  playing" + position + " "+ " " + club);
    }
}
