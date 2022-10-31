package OOP_Inheritance.Main_CAR;

public class Mercedes extends Car {
    String classType;

    public Mercedes(String name, String model, int maxSpeed, int year, double volume, String classType) {
        super(name, model, maxSpeed, year, volume);
        this.classType = classType;
    }

    public Mercedes() {
    }

    @Override
    public void ride(){
        System.out.println("Mercedes is riding" + classType + toString());

    }
}


