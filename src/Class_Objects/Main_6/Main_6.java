package Class_Objects.Main_6;

public class Main_6 {
    public static void main(String[] args) {
        Player pl1 = new Player(1,"Hector","Bellerin","Defender");
        Player pl2 = new Player(2,"Gerard","Pique","Defender");
        Player pl3 = new Player(3,"Sergio","Busquets","Midfielder");
        Player pl4 = new Player(4,"Ousmane","Dembele","Forward");
        Player pl5 = new Player(5,"Inaki","Pena","Goalkeeper");

        Player pl6 = new Player(6,"Alisson","Becker","Goalkeeper");
        Player pl7 = new Player(7,"Joe","Gomez","Defender");
        Player pl8 = new Player(8,"Naby","Keita","Midfielder");
        Player pl9 = new Player(9,"Roberto","Firmino","Forward");
        Player pl10 = new Player(10,"Calvin","Ramsay","Defender");

        Player arr [] = {pl1,pl2,pl3,pl4,pl5};
        Player arr2 [] = {pl6,pl7,pl8,pl9,pl10};

        Club club1  = new Club("Barcelona","Spain",20, arr);
        Club club2 = new Club("Liverpool","England",50,arr2);

        Club[] clubs = {club1,club2};

        for(int i = 0;i< clubs.length; i++){
            clubs[i].printClubData();

        }

    }

}
