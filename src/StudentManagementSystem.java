import java.util.*;

public class StudentManagementSystem{
    public static void main(String[] args){
        List<Student> studentList = new ArrayList<>();

        studentList.add(new Student(1648,"Miti","English"));
        studentList.add(new Student(1632,"Monica","Physics"));
        studentList.add(new Student(1656,"Ayoishee","Chemistry"));
        studentList.add(new Student(1604,"Munni","Biology"));
        studentList.add(new Student(1602,"Usrat","Math"));

        System.out.println("Initial list:");
        for(Student student: studentList){
            System.out.println(student.toString());
        }
        studentList.add(5,new Student(1642,"Irin","Economics"));
        studentList.remove(3);
        System.out.println("\nNew list:");
        for(Student student: studentList) {
            System.out.println(student.toString());
        }
        System.out.println();

        HashSet<Student> studentHashSet = new HashSet<>(studentList);
        studentHashSet.add(new Student(1632,"Monica","Physics"));

        boolean enrolled= studentHashSet.contains(new Student(1656,"Ayoishee","Chemistry"));
        if(enrolled){
            System.out.println("This person is enrolled.");
        }
        else System.out.println("This person is not enrolled.");

        System.out.println("\nNew hashed list:");
        for(Student student: studentHashSet){
            System.out.println(student.toString());
        }
        System.out.println();

        HashMap<Integer, Student> studentMap = new HashMap<>();
        for(Student student: studentList) {
            studentMap.put(student.getStudentID(),student);
        }
        Student retrived = studentMap.get(1602);

        System.out.println("Retrieved student-"+ retrived.toString());
    }
}
