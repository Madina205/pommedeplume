package OOP_Inheritance.Main_Player;

public class OlimpicGames {
    String city;

    int year;

    Sportsman sportsmansList[];

    public OlimpicGames(String city, int year, Sportsman[] sportsmansList) {
        this.city = city;
        this.year = year;
        this.sportsmansList = sportsmansList;
    }

    public OlimpicGames() {
    }

    public void play (){
        // System.out.println("Sportsman  "  + toString()  + " is  playing" + city + year + sportsmansList);
        for(int i =0; i< sportsmansList.length; i++){
            sportsmansList[i].play();
        }

    }
}
