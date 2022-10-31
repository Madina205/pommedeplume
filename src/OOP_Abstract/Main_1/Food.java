package OOP_Abstract.Main_1;

abstract class Food {
    String name;

    public Food(String name) {
        this.name = name;
    }

    public Food() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    abstract double getCalories();

}
