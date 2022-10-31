package OOP_Abstract.Main_4;

public class ERPSystem {
    User []memory = new User[1000];
    int sizeOfUsers = 0;

    public ERPSystem(User[] memory, int sizeOfUsers) {
        this.memory = memory;
        this.sizeOfUsers = sizeOfUsers;
    }

    public ERPSystem() {
    }

    public User[] getMemory() {
        return memory;
    }

    public void setMemory(User[] memory) {
        this.memory = memory;
    }

    public int getSizeOfUsers() {
        return sizeOfUsers;
    }

    public void setSizeOfUsers(int sizeOfUsers) {
        this.sizeOfUsers = sizeOfUsers;
    }

    void addUser(User u) {
        memory[sizeOfUsers] = u;
        sizeOfUsers++;

    }

    void printAllUsers(){
        for( int  i  =0; i< memory.length; i++){
            System.out.println(memory[i].getUserData());
        }
    }

    //метод выводит на экран одного пользователя, но если пользователь по данному индексу не существует, то выводит сообщение: "No such user in this index"
    void printUser(int index){

    }




}
