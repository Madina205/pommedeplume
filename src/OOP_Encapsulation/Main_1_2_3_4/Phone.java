package OOP_Encapsulation.Main_1_2_3_4;

public class Phone {
    private String name;
   private String model;
    private int price;
    private int memory;

    public Phone(String name, String model, int price, int memory) {
        this.name = name;
        this.model = model;
        this.price = price;
        this.memory = memory;
    }

    public Phone() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getMemory() {
        return memory;
    }

    public void setMemory(int memory) {
        this.memory = memory;
    }

    public  String getCategory() {
        String str = "";
            if (getPrice() >= 1000) str = "TOP";
            else if (getPrice() >= 500 && getPrice() < 1000) {
                str = "MEDIUM";
            } else {
                str = "SIMPLE";
            }

        return str;
    }



}
