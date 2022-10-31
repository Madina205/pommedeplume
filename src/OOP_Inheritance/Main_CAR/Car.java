package OOP_Inheritance.Main_CAR;

public class Car {
    String name;
    String model;
    int maxSpeed;
    int year;
    double volume;

    public Car(String name, String model, int maxSpeed, int year, double volume) {
        this.name = name;
        this.model = model;
        this.maxSpeed = maxSpeed;
        this.year = year;
        this.volume = volume;
    }

    public Car() {
    }

    public void ride() {
        System.out.println("Car is riding"   + toString());
    }

    public String toString () {
        return name + " " + model +  " "  + maxSpeed + " " + year + " " +  volume;
    }


}
