package OOP_Inheritance.Main_Player;

public class Main_2 {
    public static void main(String[] args) {
        Gymnast g1 = new Gymnast("Simone Biles", 25, "USA", 142,47, "Artistic Gymnastics");
        Gymnast g2 = new Gymnast("Gina Gogean", 45, "Romania", 152,50, "Artistic Gymnastics");
        Gymnast g3 = new Gymnast("Alicia Sacramone", 34, "USA", 155,55, "Artistic Gymnastics");

        Footballer f1 = new Footballer("Lionel Messi",35, "Argentina", "Forward", "Barcelona");
        Footballer f2 = new Footballer("Cristiano Ronaldo",37, "Portugal", "Forward", "Real Madrid");
        Footballer f3 = new Footballer("Xavi BLa",42, "Spain", "Midfielder", "Barcelona");

        Swimmer  s1 = new Swimmer("Martha Irene Randall", 74, "USA","Freestyle", 123 );
        Swimmer  s2 = new Swimmer("Michael Fred Phelps", 37, "USA","Freestyle", 124 );
        Swimmer  s3 = new Swimmer("Ian James Thorpe", 40, "Australia","Freestyle", 123 );

        Sportsman[] sp  = {g1,g2,g3,f1,f2,f3,s1,s2,s3};

        OlimpicGames OL =  new OlimpicGames("Tokyo", 2020, sp);

        OL.play();

    }
}
