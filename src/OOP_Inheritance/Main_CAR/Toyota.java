package OOP_Inheritance.Main_CAR;

public class Toyota extends Car{
    String manufacturer;


    public Toyota(String name, String model, int maxSpeed, int year, double volume, String manufacturer) {
        super(name, model, maxSpeed, year, volume);
        this.manufacturer = manufacturer;
    }

    public Toyota() {
    }

    @Override
    public  void ride() {
        System.out.println("Toyota is riding" + manufacturer + toString());
    }
}
