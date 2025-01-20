package pl;


public class Lecture {
    private int lectureID;
    private String code;
    private String name;
    private String teacherID;

    public Lecture() {
    }

    
    public Lecture(int lectureID, String code, String name, String teacherID) {
        this.lectureID = lectureID;
        this.code = code;
        this.name = name;
        this.teacherID = teacherID;
    }

    public int getLectureID() {
        return lectureID;
    }

    public void setLectureID(int lectureID) {
        this.lectureID = lectureID;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTeacherID() {
        return teacherID;
    }

    public void setTeacherID(String teacherID) {
        this.teacherID = teacherID;
    }

    @Override
    public String toString() {
        return "lectureID=" + lectureID + ", code=" + code + ", name=" + name + ", teacherID=" + teacherID;
    }
}
