package OOP_Abstract.Main_1;

 class Chocolate extends Food {
    int weight;

     public Chocolate(String name, int weight) {
         super(name);
         this.weight = weight;
     }

     public Chocolate() {
         this.weight = weight;
     }

     @Override
    public double getCalories () {
         return 740 * weight;
     }
}
