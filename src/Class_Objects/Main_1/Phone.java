package Class_Objects.Main_1;

public class Phone {
    String name;
    String model;
    int price;

    public Phone(String name, String model, int price) {
        this.name = name;
        this.model = model;
        this.price = price;
    }

    public Phone() {
        this.name = " ";
        this.model = " ";
        this.price = 0;

    }

    public String getData(){
        return name + " " + model  + " " + price;

    }
}
