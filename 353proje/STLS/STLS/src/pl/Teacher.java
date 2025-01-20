package pl;
public class Teacher extends Person {

    public Teacher() {

    }

    public Teacher(int ID, String name, String surname, String email, String password) {
        super(ID, name, surname, email, password);
    }

    @Override
    public String toString() {
        return super.toString();
    }

}
