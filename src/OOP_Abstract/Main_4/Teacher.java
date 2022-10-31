package OOP_Abstract.Main_4;

public class Teacher extends User {
    String nickName;
    String status; //// например: Professor, Lecturer, Tutor, Assistant.
    String subjects[] = new String[10]; //// Предметы которые он ведет, максимум 10
    int sizeOfSubjects = 0;

    public Teacher(int id, String login, String password, String nickName, String status, String[] subjects, int sizeOfSubjects) {
        super(id, login, password);
        this.nickName = nickName;
        this.status = status;
        this.subjects = subjects;
        this.sizeOfSubjects = sizeOfSubjects;
    }

    public Teacher() {
    }

    public String getNickName() {
        return nickName;
    }

    public String getStatus() {
        return status;
    }

    public String[] getSubjects() {
        return subjects;
    }

    public int getSizeOfSubjects() {
        return sizeOfSubjects;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getUserData(){
        return nickName + " " + status + " " + subjects + " " + sizeOfSubjects;
    }


}
