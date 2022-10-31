package OOP_Inheritance.Main_Player;

public class Gymnast extends Sportsman{
    int height;

    int weight;

    String style;

    public Gymnast(String fullName, int age, String country, int height, int weight, String style) {
        super(fullName, age, country);
        this.height = height;
        this.weight = weight;
        this.style = style;
    }

    public Gymnast() {}

    @Override
    public void play (){
        System.out.println("Gymnast  "  + toString()  + " is  playing" + height + weight + style);
    }

}
