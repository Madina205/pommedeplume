package Try_Catch.Main_2;

public class Main_2 {
    public static void main(String[] args) {
        Book b1 = new Book(1, "QWERTY", "Author1");
        Book b2 = new Book(2, "ASDFG", "Author2");
        Book b3 = new Book(3, "ZXCVB", "Author3");
        Book b4 = null;
        Library l1 = new Library("Lib","Almaty");


        l1.addBook(b1);
        l1.addBook(b2);
        l1.addBook(b3);
        l1.addBook(b4);


        l1.printBooks();

    }
}
