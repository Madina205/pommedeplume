package Try_Catch.Main_2;

public class Library {
    String name;

    String city;

    Book knigi [] = new Book[4];

    int index = 0;

    public Library(String name, String city) {
        this.name = name;
        this.city = city;
    }

    public Library() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void addBook (Book kniga){
            try {
                knigi [index] = kniga;
                index++;
            } catch ( ArrayIndexOutOfBoundsException Ainara){
                System.out.println("The library is full");
                Ainara.printStackTrace();
            }
        }


    public void printBooks(){

        for(int i =0; i<index;i++){
            try{
                System.out.println(knigi[i].getData());
            } catch(NullPointerException madina){
                System.out.println("The book is empty");
                madina.printStackTrace();
            }
        }
    }


}
