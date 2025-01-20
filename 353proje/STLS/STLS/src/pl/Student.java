package pl;

public class Student extends Person {

    private String studentNo;

    public Student() {
    }

    public Student(int ID, String studentNo, String name, String surname, String email, String password) {
        super(ID, name, surname, email, password);
        this.studentNo = studentNo;
    }

    public String getStudentNo() {
        return studentNo;
    }

    public void setStudentNo(String studentNo) {
        this.studentNo = studentNo;
    }

    @Override
    public String toString() {
        return super.toString() + "studentNo=" + studentNo;
    }

}
