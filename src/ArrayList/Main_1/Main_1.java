package ArrayList.Main_1;

import java.util.ArrayList;

public class Main_1 {
    public static void main(String[] args) {
        ArrayList<Players> players = new ArrayList();
        Players p1  = new Players ("Aygerim",3.4, 34);
        Players p2 = new Players("Alisher",3.5, 5);
        Players p3 = new Players("Madina",3.6, 35);
        Players p4 = new Players("Aidana",3.7, 36);
        Players p5 = new Players("Aya",3.9, 37);
        Players p6 = new Players("Akmola",4.4, 24);
        Players p7 = new Players("Astana",5.4, 14);
        Players p8 = new Players("Aidana",6.4, 44);
        Players p9 = new Players("Ainara",7.4, 64);
        Players p10 = new Players("Aika",8.4, 84);
        players.add(p1);
        players.add(p2);
        players.add(p3);
        players.add(p4);
        players.add(p5);
        players.add(p6);
        players.add(p7);
        players.add(p8);
        players.add(p9);
        players.add(p10);

        double sum = 0;
        int summa = 0;

        for ( int i = 0; i<players.size(); i++){
            sum = sum+ players.get(i).price;
            summa = summa + players.get(i).age;
        }
        System.out.println("Average price: " + sum/10);
        System.out.println("Sum of age: " + summa);



    }

}
