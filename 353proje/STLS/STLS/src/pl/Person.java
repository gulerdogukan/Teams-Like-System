package pl;
public class Person implements IPerson {

    private int ID;
    private String name;
    private String surname;
    private String email;
    private String password;

    public Person() {
    }

    public Person(int ID, String name, String surname, String email, String password) {
        this.ID = ID;
        this.name = name;
        this.surname = surname;
        this.email = email;
        this.password = password;
    }

    @Override
    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String getSurname() {
        return surname;
    }

    @Override
    public void setSurname(String surname) {
        this.surname = surname;
    }

    @Override
    public String getEmail() {
        return email;
    }

    @Override
    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String getPassword() {
        return password;
    }

    @Override
    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "ID=" + ID + "name=" + name + ", surname=" + surname + ", email=" + email + ", password=" + password;
    }
    
}
