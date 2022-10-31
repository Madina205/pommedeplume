package OOP_Encapsulation.Main_1_2_3_4;

public class Main_1 {
    public static void main(String[] args) {

        Phone ph1 = new Phone("Xiomi", "Redmi", 600, 256);
        Phone ph2 = new Phone("Iphone", "14pro", 1600, 128);
        Phone ph3 = new Phone("Samsung", "Galaxy", 2600, 512);
        Phone ph4 = new Phone("Motorola", "K5", 350, 16);
        Phone ph5 = new Phone("Nokia", "ALR", 5000, 64);
        Phone ph6 = new Phone("LG", "Rayan", 1200, 16);
        Phone ph7 = new Phone("Lenovo", "Ainara", 400, 512);
        Phone ph8 = new Phone("Meizu", "Madina", 3000, 128);
        Phone ph9 = new Phone("Sony", "Aisha", 9000, 64);
        Phone ph10 = new Phone("Asus", "Eldar", 200, 8);

        Phone[] phones = {ph1, ph2, ph3, ph4, ph5,ph6,ph7,ph8,ph9,ph10};

//        for (int i =0 ; i<phones.length;i++){
//            System.out.println(phones[i].getCategory() + " " + phones[i].getName());
//        }

        System.out.println("__________________");

        for (int i =0 ; i<phones.length;i++){
            if(phones[i].getCategory().equals("TOP")  || phones[i].getCategory().equals("SIMPLE")){
                System.out.println(phones[i].getCategory() + phones[i].getName());
            }
        }


    }


}










