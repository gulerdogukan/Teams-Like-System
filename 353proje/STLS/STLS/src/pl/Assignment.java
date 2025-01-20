package pl;

public class Assignment {
    private int asID; //assignment id
    private int lectureID;
    private String header;
    private String explanation;
    private String dueDate;
    private String studentID;
    private String fileLocation;

    public Assignment() {
    }

    public Assignment(int asID, int lectureID, String header, String explanation, String dueDate, String studentID, String fileLocation) {
        this.asID = asID;
        this.lectureID = lectureID;
        this.header = header;
        this.explanation = explanation;
        this.dueDate = dueDate;
        this.studentID = studentID;
        this.fileLocation = fileLocation;
    }

    public int getAsID() {
        return asID;
    }

    public void setAsID(int asID) {
        this.asID = asID;
    }

    public int getLectureID() {
        return lectureID;
    }

    public void setLectureID(int lectureID) {
        this.lectureID = lectureID;
    }

    public String getHeader() {
        return header;
    }

    public void setHeader(String header) {
        this.header = header;
    }

    public String getExplanation() {
        return explanation;
    }

    public void setExplanation(String explanation) {
        this.explanation = explanation;
    }

    public String getDueDate() {
        return dueDate;
    }

    public void setDueDate(String dueDate) {
        this.dueDate = dueDate;
    }

    public String getStudentID() {
        return studentID;
    }

    public void setStudentID(String studentID) {
        this.studentID = studentID;
    }

    public String getFileLocation() {
        return fileLocation;
    }

    public void setFileLocation(String fileLocation) {
        this.fileLocation = fileLocation;
    }

    @Override
    public String toString() {
        return "asID=" + asID + ", lectureID=" + lectureID + ", header=" + header + ", explanation=" + explanation + ", dueDate=" + dueDate + ", studentID=" + studentID + ", fileLocation=" + fileLocation;
    }
    
    
    
}
