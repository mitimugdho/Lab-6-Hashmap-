import java.util.HashSet;
public class Student{
    private final int studentID;
    private final String studentName;
    private final String major;
    public Student(int studentID, String studentName,String major){
        this.studentID = studentID;
        this.studentName = studentName;
        this.major = major;
    }

    public int getStudentID() {
        return studentID;
    }
    public String getStudentName(){
        return studentName;
    }
    private String getMajor(){
        return major;
    }
    public String toString(){
        return "Name: "+studentName+"; Student ID: "+studentID+"; Major: "+major+".";
    }
    @Override
    public boolean equals(Object obj){
        if (this== obj) return true;
        else if(obj == null) return false;
        if(!(obj instanceof Student)){
            return false;

        }
        Student student= (Student) obj;
        if(studentID != student.getStudentID()){
            return false;
        }
        return true;
    }
    @Override
    public int hashCode(){
        return  Integer.hashCode(studentID);
    }
}
