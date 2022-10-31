package OOP_Abstract.Main_1;

public class Burger  extends Food {

    int meatAmount; // количество мяса 1,2 или 3
    int meatType; //тип мяса, 1 - это говядина, 2 - это курица.

    public Burger(String name, int meatAmount, int meatType) {
        super(name);
        this.meatAmount = meatAmount;
        this.meatType = meatType;
    }

    public Burger() {
    }

    @Override
    public double getCalories(){
        if(meatType==1){
            return meatAmount*840;
        } else {
            return meatAmount*560;
        }

    }
}
