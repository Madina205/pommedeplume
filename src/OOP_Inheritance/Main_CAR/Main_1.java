package OOP_Inheritance.Main_CAR;

public class Main_1 {
    public static void main(String[] args) {
    Car car1 = new Car("Ferrari", "MASHINA",300,2013,2.0);
    Car car2 = new Car("Ferrero", "MASHINA",340,2033,2.0);
    Car car3 = new Car("Lambo", "MASHINA",220,2023,2.0);

    Toyota toyota1 = new Toyota("Toyota", "Camry", 200, 2022, 2.0, "Japan");
    Toyota toyota2 = new Toyota("Toyota", "Rav4", 300, 2022, 3.0, "Japan");
    Toyota toyota3 = new Toyota("Toyota", "Prado", 400, 2022, 4.0, "Japan");

    Mercedes mercedes1 = new Mercedes("Mercedes","QWERTY",200, 2023,3.0, "E");
    Mercedes mercedes2 = new Mercedes("Mercedes","AZERTY",300, 2023,6.0, "S");
    Mercedes mercedes3 = new Mercedes("Mercedes","BENZ",500, 2024,3.0, "J");


    Car [] cars = {car1,car2,car3,toyota1,toyota2,toyota3,mercedes1,mercedes2,mercedes3};

        for (int i =0; i<cars.length; i++){
            cars[i].ride();
        }

}
}
