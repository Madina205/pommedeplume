package Class_Objects.Main_2;

public class Main_2 {
    public static void main(String[] args) {
    Phone phone1 = new Phone("Xiaomi", "Note", 200000);
    Phone phone2 = new Phone("IPhone", "14PRO", 1500000);
    Phone phone3 = new Phone("Samsung", "Galaxy", 400000);
    Phone phone4 = new Phone("Motorola", "Zen", 100000);
    Phone phone5 = new Phone("Nokia", "QW", 800000);

    Phone arr[] = {phone1, phone2, phone3, phone4, phone5};

    for (int i = 0; i<arr.length;i++){
    System.out.println(arr[i].getData());
}
}
}

