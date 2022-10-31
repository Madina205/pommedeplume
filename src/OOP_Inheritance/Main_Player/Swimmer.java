package OOP_Inheritance.Main_Player;

public class Swimmer extends Sportsman {
    String style;

    double recordTime;

    public Swimmer(String fullName, int age, String country, String style, double recordTime) {
        super(fullName, age, country);
        this.style = style;
        this.recordTime = recordTime;
    }

    public Swimmer() {}

    @Override
    public void play (){
        System.out.println("Swimmer "  + toString()  + " is  playing" + style + recordTime);
    }
}
