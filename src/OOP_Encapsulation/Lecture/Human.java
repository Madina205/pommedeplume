package OOP_Encapsulation.Lecture;

public class Human {
     private String name;
     private int age;
     private int height; // переменная height доступна для всех,
    // кто находится в классе Human в одном package


    public Human(String name, int age, int height) {
        this.name = name;
        this.age = age;
        this.height = height;
    }

    public String getName(){
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getHeight() {
        return height;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        if(age>0) {
            this.age = age;
        } else {
            System.out.println("ERROR");
        }
    }

    public void setHeight(int height) {
        if(height>0){
            this.height = height;
        } else {
            System.out.println("ERROR");
        }
    }

    @Override
    public String toString() {
        return "Human{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", height=" + height +
                '}';
    }
}
