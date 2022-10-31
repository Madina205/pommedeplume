package OOP_Abstract.Main_1;

public class Main_1 {
    public static void main(String[] args) {
        Chocolate snickers = new Chocolate("Snickers", 10);
        Chocolate mars = new Chocolate("Mars", 15);

        Burger burgerKing = new Burger("BurgerKing", 3, 1);
        Burger salamBro = new Burger("SalamBro", 2, 2);

        Coke cola = new Coke("Cola", 1, true);
        Coke fuse = new Coke("Fuse", 2, false);

        Food [] foods = {snickers,mars,burgerKing,salamBro,cola,fuse};

        for(int i  =0; i< foods.length; i++){
            System.out.println(foods[i].getName() + " " + foods[i].getCalories());
        }

        System.out.println("________");

        int max =0;
        int indexOfMax=0;

        for ( int i =0;  i< foods.length; i++){
            if (max < foods[i].getCalories()){
                max = (int) foods[i].getCalories();
                indexOfMax =  i;
            }
        }
        System.out.println(foods[indexOfMax].getName());



    }
}
