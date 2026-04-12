import student.Student;
import result.Result;

public class grading {
    public static void main(String[] args) {

        Student s1 = new Student("Divya", 88);

        Result r = new Result();
        r.calculateGrade(s1);
    }
}